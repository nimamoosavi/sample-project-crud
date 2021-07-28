package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.integration.domain.view.cost.CostReqVM;
import com.webold.integration.domain.view.cost.CostResVM;

public interface CostService extends GeneralService<CostReqVM, CostResVM, Long> {
}
