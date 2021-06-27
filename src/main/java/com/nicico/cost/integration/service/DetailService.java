package com.nicico.cost.integration.service;

import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.tree.service.TreeService;

import java.util.List;

public interface DetailService extends TreeService<DetailReqVM, DetailResVM, Long> {

    BaseDTO<List<DetailResVM>> findAllByDetailTypes(Long detailTypeId);

    BaseDTO<PageDTO<List<DetailResVM>>> findAllByDetailTypes(Long detailTypeId, Integer page, Integer pageSize);

    BaseDTO<List<DetailResVM>> findAllByDetailTypesAndParentDetailIs(Long detailTypeId, Long detailParentId);

    BaseDTO<PageDTO<List<DetailResVM>>> findAllByDetailTypesAndParentDetailIs(Long detailTypeId, Long detailParentId, Integer page, Integer pageSize);
}
