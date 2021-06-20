package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;

public interface OrganizationService extends GeneralService<OrganizationReqVM, OrganizationResVM, Long> {
}
