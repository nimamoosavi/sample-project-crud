package com.nicico.cost.integration.service.impl;


import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.Cost;
import com.nicico.cost.integration.domain.view.cost.CostReqVM;
import com.nicico.cost.integration.domain.view.cost.CostResVM;
import com.nicico.cost.integration.service.CostService;
import org.springframework.stereotype.Service;

@Service
class CostServiceImpl extends GeneralServiceImpl<Cost, CostReqVM, CostResVM, Long> implements CostService {
}
