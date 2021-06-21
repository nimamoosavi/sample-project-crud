package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JdbcRepository<Detail, Long> {
}
