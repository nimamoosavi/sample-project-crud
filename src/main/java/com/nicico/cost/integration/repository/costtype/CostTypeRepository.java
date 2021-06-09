package com.nicico.cost.integration.repository.costtype;

import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostTypeRepository extends JdbcRepository<CostType, Long> {
    CostType findCostTypeByCode(String code);
}
