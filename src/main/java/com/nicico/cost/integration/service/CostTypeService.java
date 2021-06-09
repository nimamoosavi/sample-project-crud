package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.request.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.response.CostTypeResVM;
import com.nicico.cost.integration.repository.costtype.CostTypeJdbcService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class CostTypeService extends GeneralService<CostType, CostTypeReqVM, CostTypeResVM, Long> {

    private final CostTypeJdbcService costTypeJdbcService;

    public BaseDTO<CostTypeResVM> findByCode(@NotNull String code) {
        CostType costType = costTypeJdbcService.findByCode(code);
        return generalMapper.mapBaseObjectToResponse(costType);
    }
}
