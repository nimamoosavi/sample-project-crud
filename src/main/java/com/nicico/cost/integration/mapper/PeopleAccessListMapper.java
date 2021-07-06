package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleAccessListMapper extends GeneralMapper<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM> {
}
