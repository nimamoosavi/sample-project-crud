package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleMapper extends GeneralMapper<People, PeopleReqVM, PeopleResVM> {
}
