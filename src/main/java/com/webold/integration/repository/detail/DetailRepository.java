package com.webold.integration.repository.detail;

import com.webold.integration.domain.entity.Detail;
import com.webold.jdbcclient.repository.TreeJdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailRepository extends TreeJdbcRepository<Detail, Long> {
}
