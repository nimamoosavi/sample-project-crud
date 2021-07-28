package com.webold.integration.service;

import com.webold.integration.domain.view.detail.DetailReqVM;
import com.webold.integration.domain.view.detail.DetailResVM;
import com.webold.crud.service.TreeService;

public interface DetailService extends TreeService<DetailReqVM, DetailResVM, Long> {

}
