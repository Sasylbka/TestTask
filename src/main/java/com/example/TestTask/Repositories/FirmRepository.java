package com.example.TestTask.Repositories;

import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Entities.TransportKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface FirmRepository extends JpaRepository<Firm,Long> {
    @Modifying
    @Transactional
    @Query(value ="update v_firm set tlgr = :tlgr," +
            "disloc = :disloc " +
            "where id=:id"
            ,nativeQuery = true)
    void update(@Param("id") Long id, @Param("tlgr") String tlgr, @Param("disloc") String disloc);

    @Query(value = "select * from v_firm where tlgr=:tlgr",nativeQuery = true)
    Firm findByTlgr(@Param("tlgr") String tlgr);
}
