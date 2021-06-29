package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.tree.repository.impl.jdbc.TreeJdbcRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface DetailRepository extends TreeJdbcRepository<Detail, Long> {

    List<Detail> findAllByDetailTypesAndIsFolderFalse(DetailType detailType);

    Page<Detail> findAllByDetailTypesAndIsFolderFalse(DetailType detailType, Pageable pageable);
}
