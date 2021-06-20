package com.nicico.cost.integration.service.impl;


import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import com.nicico.cost.integration.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends GeneralServiceImpl<Organization, OrganizationReqVM, OrganizationResVM, Long> implements OrganizationService {
}
