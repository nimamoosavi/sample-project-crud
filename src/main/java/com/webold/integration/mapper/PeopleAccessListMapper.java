package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.PeopleAccessList;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleAccessListMapper extends GeneralMapper<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM> {
}
