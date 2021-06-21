package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeReqVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import com.nicico.cost.integration.service.DetailTypeService;
import org.springframework.stereotype.Service;

@Service
class DetailTypeServiceImpl extends GeneralServiceImpl<DetailType, DetailTypeReqVM, DetailTypeResVM, Long> implements DetailTypeService {

}
