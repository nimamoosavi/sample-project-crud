package com.nicico.cost.integration.repository.costtype;

import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CostTypeRepository extends JdbcRepository<CostType, Long> {
    Optional<CostType> findByCode(String code);
}
