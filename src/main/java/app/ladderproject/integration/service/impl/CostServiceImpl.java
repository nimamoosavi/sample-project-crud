package app.ladderproject.integration.service.impl;


import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.domain.entity.Cost;
import app.ladderproject.integration.domain.view.cost.CostReqVM;
import app.ladderproject.integration.domain.view.cost.CostResVM;
import app.ladderproject.integration.service.CostService;
import org.springframework.stereotype.Service;

@Service
class CostServiceImpl extends GeneralServiceImpl<Cost, CostReqVM, CostResVM, Long> implements CostService {
}
