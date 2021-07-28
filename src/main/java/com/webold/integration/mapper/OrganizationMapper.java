package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.Organization;
import com.webold.integration.domain.view.organization.OrganizationReqVM;
import com.webold.integration.domain.view.organization.OrganizationResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class OrganizationMapper extends GeneralMapper<Organization, OrganizationReqVM, OrganizationResVM> {

    @AfterMapping
    public void afterMappingBaseObjectToResponseModel(@MappingTarget OrganizationResVM organizationResVM, Organization target) {
        if (target.getParentOrganization() != null)
            organizationResVM.setParentOrganizationId(target.getParentOrganization().getId());
        if (target.getDepartment() != null)
            organizationResVM.setDepartmentId(target.getDepartment().getId());
    }

}
