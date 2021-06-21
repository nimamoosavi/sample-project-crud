package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;
import com.nicico.cost.integration.service.AccMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class AccMapServiceImpl extends GeneralServiceImpl<AccMap, AccMapReqVM, AccMapResVM, Long> implements AccMapService {
}
