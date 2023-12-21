package com.example.TestTask.Repositories;

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
public interface TransportKindRepository extends JpaRepository<TransportKind,Long> {
    @Modifying
    @Transactional
    @Query(value ="update vidtc set shname = :shname," +
            "fullname = :fullname " +
            "where id=:id"
            ,nativeQuery = true)
    void update(@Param("id") Long id, @Param("shname") String shname, @Param("fullname") String fullname);

    @Query(value = "select * from vidtc where fullname=:fullname",nativeQuery = true)
    TransportKind findByFullname(@Param("fullname") String fullname);
}
