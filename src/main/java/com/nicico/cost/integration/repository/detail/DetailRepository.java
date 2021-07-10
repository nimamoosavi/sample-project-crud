package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.jdbcclient.repository.TreeJdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailRepository extends TreeJdbcRepository<Detail, Long> {
}
