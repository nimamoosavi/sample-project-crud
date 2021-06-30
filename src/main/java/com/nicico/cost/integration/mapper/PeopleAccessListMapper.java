package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import com.nicico.cost.integration.service.OrganizationService;
import com.nicico.cost.integration.service.PeopleService;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleAccessListMapper extends GeneralMapper<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM> {

    @Autowired
    PeopleService peopleService;
    @Autowired
    PeopleMapper peopleMapper;
    @Autowired
    OrganizationService organizationService;
    @Autowired
    OrganizationMapper organizationMapper;

    @Override
    public PeopleAccessList requestToBaseObject(PeopleAccessListReqVM source) {
        PeopleAccessList peopleAccessList = new PeopleAccessList();

        PeopleResVM peopleResVM = peopleService.findById(source.getPeopleId()).getData();
        OrganizationResVM organizationResVM = organizationService.findById(source.getOrganizationId()).getData();

        peopleAccessList.setPeople(peopleMapper.mapResponseToBaseObject(peopleResVM).getData());
        peopleAccessList.setOrganization(organizationMapper.mapResponseToBaseObject(organizationResVM).getData());
        peopleAccessList.setWriteAccess(source.isWriteAccess());
        if (source.isWriteAccess()) {
            peopleAccessList.setReadAccess(true);
        } else {
            peopleAccessList.setReadAccess(source.isReadAccess());
        }
        return peopleAccessList;
    }

    @AfterMapping
    public void afterMappingBaseObjectToResponseModel(@MappingTarget PeopleAccessListResVM peopleAccessListResVM, PeopleAccessList target) {
        if (target.getPeople() != null)
            peopleAccessListResVM.setPeopleId(target.getPeople().getId());
        if (target.getOrganization() != null)
            peopleAccessListResVM.setOrganizationId(target.getOrganization().getId());
    }
}
