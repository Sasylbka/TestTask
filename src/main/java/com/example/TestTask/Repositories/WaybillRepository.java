package com.example.TestTask.Repositories;

import com.example.TestTask.Entities.Waybill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaybillRepository extends JpaRepository<Waybill,Long> {
}
