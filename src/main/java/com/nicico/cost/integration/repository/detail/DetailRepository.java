package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface DetailRepository extends JdbcRepository<Detail, Long> {
    List<Detail> findAllByDetailTypes(DetailType detailType);

    Page<Detail> findAllByDetailTypes(DetailType detailType, Pageable pageable);

    List<Detail> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail);

    Page<Detail> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail, Pageable pageable);
}
