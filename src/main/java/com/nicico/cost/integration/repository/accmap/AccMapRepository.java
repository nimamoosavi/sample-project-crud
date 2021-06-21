package com.nicico.cost.integration.repository.accmap;

import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccMapRepository extends JdbcRepository<AccMap, Long> {
}
