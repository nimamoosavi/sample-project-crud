package com.nicico.cost.integration.repository.accmap;

import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccMapRepository extends JdbcRepository<AccMap, Long> {

    Optional<AccMap> findByCode(String code);
}
