package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.costtype.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.costtype.CostTypeResVM;
import com.nicico.cost.integration.repository.costtype.CostTypeJdbcService;
import com.nicico.cost.integration.service.CostTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class CostTypeServiceImpl extends GeneralServiceImpl<CostType, CostTypeReqVM, CostTypeResVM, Long> implements CostTypeService {

    private final CostTypeJdbcService costTypeJdbcService;

    public BaseDTO<CostTypeResVM> findByCode(@NotNull String code) {
        CostType costType = costTypeJdbcService.findByCode(code);
        return generalMapper.mapBaseObjectToResponse(costType);
    }
}
