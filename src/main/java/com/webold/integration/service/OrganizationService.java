package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.integration.domain.view.organization.OrganizationReqVM;
import com.webold.integration.domain.view.organization.OrganizationResVM;

public interface OrganizationService extends GeneralService<OrganizationReqVM, OrganizationResVM, Long> {
}
