package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.service.DetailService;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl extends GeneralServiceImpl<Detail, DetailReqVM, DetailResVM, Long> implements DetailService {
}
