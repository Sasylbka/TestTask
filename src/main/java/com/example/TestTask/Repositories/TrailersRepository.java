package com.example.TestTask.Repositories;

import com.example.TestTask.Entities.Trailers;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailersRepository extends JpaRepository<Trailers,Long> {
}
