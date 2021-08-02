package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeReqVM;
import app.ladderproject.integration.domain.view.detailtype.DetailTypeResVM;

public interface DetailTypeService extends GeneralService<DetailTypeReqVM, DetailTypeResVM, Long> {
}
