package com.nicico.cost.integration.service.impl;

import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.repository.detail.DetailJdbcService;
import com.nicico.cost.integration.repository.detailtype.DetailTypeJdbcService;
import com.nicico.cost.integration.service.DetailService;
import com.nicico.cost.tree.service.impl.TreeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.nicico.cost.framework.service.GeneralResponse.successCustomResponse;

@Service
@RequiredArgsConstructor
class DetailServiceImpl extends TreeServiceImpl<Detail, DetailReqVM, DetailResVM, Long> implements DetailService {

    private final DetailJdbcService detailRepository;
    private final DetailTypeJdbcService detailTypeJdbcService;


    private BaseDTO<PageDTO<List<DetailResVM>>> successPageResponse(PageDTO<List<Detail>> page) {
        List<DetailResVM> detailResVMS = generalMapper.mapListBaseObjectToResponse(page.getObject()).getData();
        PageDTO<List<DetailResVM>> pageDTO = PageDTO.<List<DetailResVM>>builder().totalElement(page.getTotalElement())
                .totalPages(page.getTotalPages())
                .pageSize(page.getPageSize()).object(detailResVMS).build();
        return successCustomResponse(pageDTO);
    }
}
