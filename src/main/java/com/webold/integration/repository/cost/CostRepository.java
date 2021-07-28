package com.webold.integration.repository.cost;


import com.webold.integration.domain.entity.Cost;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JdbcRepository<Cost, Long> {
}
