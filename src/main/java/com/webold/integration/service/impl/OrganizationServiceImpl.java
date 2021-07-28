package com.webold.integration.service.impl;


import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.Organization;
import com.webold.integration.domain.view.organization.OrganizationReqVM;
import com.webold.integration.domain.view.organization.OrganizationResVM;
import com.webold.integration.service.OrganizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class OrganizationServiceImpl extends GeneralServiceImpl<Organization, OrganizationReqVM, OrganizationResVM, Long> implements OrganizationService {
    @Override
    @Unauthorized
    public BaseDTO<OrganizationResVM> save(OrganizationReqVM organizationReqVM) {
        return super.save(organizationReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<OrganizationResVM>> saveAll(List<OrganizationReqVM> organizationReqVMS) {
        return super.saveAll(organizationReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<OrganizationResVM> update(OrganizationReqVM organizationReqVM) {
        return super.update(organizationReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
