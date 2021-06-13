package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class OrganizationMapper extends GeneralMapper<Organization, OrganizationReqVM, OrganizationResVM> {
}
