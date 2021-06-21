package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;

public interface DetailService extends GeneralService<DetailReqVM, DetailResVM, Long> {
}
