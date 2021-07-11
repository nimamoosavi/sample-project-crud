package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.TreeServiceImpl;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.service.DetailService;
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
