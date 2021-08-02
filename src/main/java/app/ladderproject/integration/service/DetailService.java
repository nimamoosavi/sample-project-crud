package app.ladderproject.integration.service;

import app.ladderproject.integration.domain.view.detail.DetailReqVM;
import app.ladderproject.integration.domain.view.detail.DetailResVM;
import app.ladderproject.crud.service.TreeService;

public interface DetailService extends TreeService<DetailReqVM, DetailResVM, Long> {

}
