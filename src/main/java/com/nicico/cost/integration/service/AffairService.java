package com.nicico.cost.integration.service;


import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.entity.Affair;
import com.nicico.cost.integration.domain.view.request.AffairReqVM;
import com.nicico.cost.integration.domain.view.response.AffairResVM;
import org.springframework.stereotype.Service;

@Service
public class AffairService extends GeneralService<Affair, AffairReqVM, AffairResVM, Long> {

}
