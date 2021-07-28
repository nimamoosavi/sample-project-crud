package com.webold.integration.service.impl;


import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.integration.domain.entity.Cost;
import com.webold.integration.domain.view.cost.CostReqVM;
import com.webold.integration.domain.view.cost.CostResVM;
import com.webold.integration.service.CostService;
import org.springframework.stereotype.Service;

@Service
class CostServiceImpl extends GeneralServiceImpl<Cost, CostReqVM, CostResVM, Long> implements CostService {
}
