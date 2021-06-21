package com.nicico.cost.integration.repository.detailtype;

import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailTypeRepository extends JdbcRepository<DetailType, Long> {
}
