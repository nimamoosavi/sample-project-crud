package app.ladderproject.sample.mapper;


import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class UserMapper extends GeneralMapper<User, UserReqVM, UserResVM> {
    @Autowired
    UserInfoMapper userInfoMapper;

    @AfterMapping
    public void mapBaseObjectToResponse(@MappingTarget UserResVM target, User source) {
        // This creates just for learn That how to map and used another Mapper service
    }
}
