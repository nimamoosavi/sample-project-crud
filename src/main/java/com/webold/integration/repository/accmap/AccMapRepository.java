package com.webold.integration.repository.accmap;

import com.webold.integration.domain.entity.AccMap;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccMapRepository extends JdbcRepository<AccMap, Long> {

    Optional<AccMap> findByCode(String code);
}
