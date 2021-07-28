package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.People;
import com.webold.integration.domain.view.people.PeopleReqVM;
import com.webold.integration.domain.view.people.PeopleResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleMapper extends GeneralMapper<People, PeopleReqVM, PeopleResVM> {
}
