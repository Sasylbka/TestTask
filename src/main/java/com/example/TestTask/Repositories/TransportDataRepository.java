package com.example.TestTask.Repositories;

import com.example.TestTask.Entities.Firm;
import com.example.TestTask.Entities.TransportData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface TransportDataRepository extends JpaRepository<TransportData,Long> {
    @Query(value="select * from pts where pts.firm_id = :firm_id",nativeQuery = true)
    List<TransportData> findAllByFirmId(@Param("firm_id") Long id);

    @Modifying
    @Transactional
    @Query(value ="update pts set unts = :unts," +
            "t_id = :t_id," +
            "firm_id = :firm_id," +
            "grp =:grp," +
            "normt =:normt," +
            "datasp =:datasp " +
            "where uin=:uin"
            ,nativeQuery = true)
    void update(@Param("unts") Integer unts,
                @Param("t_id") Long tId,
                @Param("firm_id") Long firmId,
                @Param("grp") Float grp,
                @Param("normt") Float normt,
                @Param("datasp")Timestamp datasp,
                @Param("uin")Long uin);


}
