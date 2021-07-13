package com.nicico.cost.integration.repository.cost;


import com.nicico.cost.integration.domain.entity.Cost;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JdbcRepository<Cost, Long> {
}
