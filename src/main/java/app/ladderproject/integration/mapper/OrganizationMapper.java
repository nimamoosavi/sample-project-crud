package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.Organization;
import app.ladderproject.integration.domain.view.organization.OrganizationReqVM;
import app.ladderproject.integration.domain.view.organization.OrganizationResVM;
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
