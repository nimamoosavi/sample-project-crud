package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.People;
import app.ladderproject.integration.domain.view.people.PeopleReqVM;
import app.ladderproject.integration.domain.view.people.PeopleResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleMapper extends GeneralMapper<People, PeopleReqVM, PeopleResVM> {
}
