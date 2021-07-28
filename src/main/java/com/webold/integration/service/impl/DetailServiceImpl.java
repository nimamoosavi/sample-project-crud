package com.webold.integration.service.impl;

import com.webold.crud.service.impl.TreeServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.Detail;
import com.webold.integration.domain.view.detail.DetailReqVM;
import com.webold.integration.domain.view.detail.DetailResVM;
import com.webold.integration.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class DetailServiceImpl extends TreeServiceImpl<Detail, DetailReqVM, DetailResVM, Long> implements DetailService {

    @Override
    @Unauthorized
    public BaseDTO<DetailResVM> save(DetailReqVM detailReqVM) {
        return super.save(detailReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<DetailResVM>> saveAll(List<DetailReqVM> detailReqVMS) {
        return super.saveAll(detailReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<DetailResVM> update(DetailReqVM detailReqVM) {
        return super.update(detailReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
