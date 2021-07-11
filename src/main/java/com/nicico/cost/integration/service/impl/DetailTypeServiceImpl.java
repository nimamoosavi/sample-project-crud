package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import com.nicico.cost.integration.service.DetailTypeService;
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
