package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService extends GeneralService<Organization, OrganizationReqVM, OrganizationResVM, Long> {
}
