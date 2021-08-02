package app.ladderproject.integration.mapper;


import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.AccMap;
import app.ladderproject.integration.domain.view.accmap.AccMapReqVM;
import app.ladderproject.integration.domain.view.accmap.AccMapResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccMapMapper extends GeneralMapper<AccMap, AccMapReqVM, AccMapResVM> {
}
