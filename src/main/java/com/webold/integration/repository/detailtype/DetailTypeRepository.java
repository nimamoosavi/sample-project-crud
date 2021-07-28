package com.webold.integration.repository.detailtype;

import com.webold.integration.domain.entity.DetailType;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailTypeRepository extends JdbcRepository<DetailType, Long> {
}
