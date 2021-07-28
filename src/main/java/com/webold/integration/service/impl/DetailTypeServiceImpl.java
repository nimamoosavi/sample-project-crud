package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.DetailType;
import com.webold.integration.domain.view.detailtype.DetailTypeReqVM;
import com.webold.integration.domain.view.detailtype.DetailTypeResVM;
import com.webold.integration.service.DetailTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DetailTypeServiceImpl extends GeneralServiceImpl<DetailType, DetailTypeReqVM, DetailTypeResVM, Long> implements DetailTypeService {

    @Override
    @Unauthorized
    public BaseDTO<DetailTypeResVM> save(DetailTypeReqVM detailTypeReqVM) {
        return super.save(detailTypeReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<DetailTypeResVM>> saveAll(List<DetailTypeReqVM> detailTypeReqVMS) {
        return super.saveAll(detailTypeReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<DetailTypeResVM> update(DetailTypeReqVM detailTypeReqVM) {
        return super.update(detailTypeReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
