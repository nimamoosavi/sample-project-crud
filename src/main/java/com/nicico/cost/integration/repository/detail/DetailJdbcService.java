package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.tree.repository.impl.jdbc.TreeJdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailJdbcService extends TreeJdbcServiceImpl<Detail, Long> {
    private final DetailRepository detailRepository;

    public List<Detail> findAllByDetailTypes(@NotNull DetailType detailType) {
        return detailRepository.findAllByDetailTypes(detailType);
    }


    public PageDTO<List<Detail>> findAllByDetailTypes(@NotNull DetailType detailType, int page, int pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<Detail> allByDetailTypes = detailRepository.findAllByDetailTypes(detailType, pagination);
        return PageDTO.<List<Detail>>builder().totalPages(allByDetailTypes.getTotalPages()).totalElement(allByDetailTypes.getTotalElements()).pageSize(allByDetailTypes.getSize()).object(allByDetailTypes.toList()).build();

    }

    public List<Detail> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail) {
        return detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detail);
    }

    public PageDTO<List<Detail>> findAllByDetailTypesAndParentDetailIs(DetailType detailType, Detail detail, int page, int pageSize) {
        Pageable pagination = pagination(page, pageSize);
        Page<Detail> detailIs = detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detail, pagination);
        return PageDTO.<List<Detail>>builder().totalPages(detailIs.getTotalPages()).totalElement(detailIs.getTotalElements()).pageSize(detailIs.getSize()).object(detailIs.toList()).build();
    }
}
