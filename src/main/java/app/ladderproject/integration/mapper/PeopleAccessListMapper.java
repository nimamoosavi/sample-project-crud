package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.PeopleAccessList;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class PeopleAccessListMapper extends GeneralMapper<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM> {
}
