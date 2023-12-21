package com.example.TestTask.Repositories;

import com.example.TestTask.Entities.TransportData;
import com.example.TestTask.Entities.TransportKind;
import com.example.TestTask.Entities.TransportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TransportTypeRepository extends JpaRepository<TransportType,Long> {
    @Query(value="select * from tiptr where tiptr.vidt_id = :kind_id",nativeQuery = true)
    List<TransportType> findAllByKindId(@Param("kind_id") Long id);

    @Modifying
    @Transactional
    @Query(value ="update tiptr set tname = :tname," +
            "vidt_id = :vidt_id," +
            "prizngr = :prizngr " +
            "where id=:id"
            ,nativeQuery = true)
    void update(@Param("id") Long id, @Param("tname") String shname, @Param("vidt_id") Long vidtId, @Param("prizngr") String prizngr);

    @Query(value = "select * from tiptr where tname=:tname",nativeQuery = true)
    TransportType findByTname(@Param("tname") String tname);
}
