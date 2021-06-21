package com.nicico.cost.integration.service;


import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;

public interface AccMapService extends GeneralService<AccMapReqVM, AccMapResVM, Long> {
}
