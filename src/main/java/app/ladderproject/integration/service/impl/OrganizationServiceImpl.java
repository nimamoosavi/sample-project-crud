package app.ladderproject.integration.service.impl;


import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.entity.Organization;
import app.ladderproject.integration.domain.view.organization.OrganizationReqVM;
import app.ladderproject.integration.domain.view.organization.OrganizationResVM;
import app.ladderproject.integration.service.OrganizationService;
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
