package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.costtype.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.costtype.CostTypeResVM;

import javax.validation.constraints.NotNull;

public interface CostTypeService extends GeneralService<CostTypeReqVM, CostTypeResVM, Long> {

    BaseDTO<CostTypeResVM> findByCode(@NotNull String code);
}
