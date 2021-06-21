package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.repository.detail.DetailJdbcService;
import com.nicico.cost.integration.repository.detailtype.DetailTypeJdbcService;
import com.nicico.cost.integration.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;


import static com.nicico.cost.framework.service.GeneralResponse.successCustomListResponse;
import static com.nicico.cost.framework.service.GeneralResponse.successCustomResponse;
import static com.nicico.cost.integration.exception.IntegrationException.DETAIL_NOT_FOUND;
import static com.nicico.cost.integration.exception.IntegrationException.DETAIL_TYPE_NOT_FOUND;

@Service
@RequiredArgsConstructor
class DetailServiceImpl extends GeneralServiceImpl<Detail, DetailReqVM, DetailResVM, Long> implements DetailService {

    private final DetailJdbcService detailRepository;
    private final DetailTypeJdbcService detailTypeJdbcService;

    @Override
    public BaseDTO<List<DetailResVM>> findAllByDetailTypes(Long detailTypeId) {
        DetailType detailType = detailTypeJdbcService.findById(detailTypeId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        List<Detail> details = detailRepository.findAllByDetailTypes(detailType);
        return generalMapper.mapListBaseObjectToResponse(details);
    }

    @Override
    public BaseDTO<PageDTO<List<DetailResVM>>> findAllByDetailTypes(Long detailTypeId, Integer page, Integer pageSize) {
        DetailType detailType = detailTypeJdbcService.findById(detailTypeId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        Page<Detail> allByDetailTypes = detailRepository.findAllByDetailTypes(detailType, page, pageSize);
        return successPageResponse(allByDetailTypes);
    }

    @Override
    public BaseDTO<List<DetailResVM>> findAllByDetailTypesAndParentDetailIs(Long detailTypeId, Long detailParentId) {
        DetailType detailType = detailTypeJdbcService.findById(detailTypeId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        Detail detailParent = detailRepository.findById(detailParentId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        List<Detail> parentDetailIs = detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detailParent);
        return successCustomListResponse(generalMapper.mapListBaseObjectToResponse(parentDetailIs).getData());
    }

    @Override
    public BaseDTO<PageDTO<List<DetailResVM>>> findAllByDetailTypesAndParentDetailIs(Long detailTypeId, Long detailParentId, Integer page, Integer pageSize) {
        DetailType detailType = detailTypeJdbcService.findById(detailTypeId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_TYPE_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        Detail detailParent = detailRepository.findById(detailParentId).orElseThrow(
                () -> applicationException.createApplicationException(DETAIL_NOT_FOUND, HttpStatus.NOT_FOUND)
        );
        Page<Detail> detailIs = detailRepository.findAllByDetailTypesAndParentDetailIs(detailType, detailParent, page, pageSize);
        return successPageResponse(detailIs);
    }


    private BaseDTO<PageDTO<List<DetailResVM>>> successPageResponse(Page<Detail> page) {
        List<DetailResVM> detailResVMS = generalMapper.mapListBaseObjectToResponse(page.toList()).getData();
        PageDTO<List<DetailResVM>> pageDTO = PageDTO.<List<DetailResVM>>builder().totalElement(page.getTotalElements())
                .totalPages(page.getTotalPages())
                .pageSize(page.getSize()).object(detailResVMS).build();
        return successCustomResponse(pageDTO);
    }
}
