package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.cost.CostReqVM;
import com.nicico.cost.integration.domain.view.cost.CostResVM;

public interface CostService extends GeneralService<CostReqVM, CostResVM, Long> {
}
