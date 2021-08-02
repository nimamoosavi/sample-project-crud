package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.cost.CostReqVM;
import app.ladderproject.integration.domain.view.cost.CostResVM;

public interface CostService extends GeneralService<CostReqVM, CostResVM, Long> {
}
