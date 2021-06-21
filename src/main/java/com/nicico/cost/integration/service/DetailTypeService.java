package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;

public interface DetailTypeService extends GeneralService<DetailTypeReqVM, DetailTypeResVM, Long> {
}
