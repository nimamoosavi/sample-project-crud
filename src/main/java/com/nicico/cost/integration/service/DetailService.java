package com.nicico.cost.integration.service;

import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.tree.service.TreeService;

public interface DetailService extends TreeService<DetailReqVM, DetailResVM, Long> {

}
