package app.ladderproject.sample.mapper;


import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
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
    private void mapBaseObjectToResponse(@MappingTarget UserResVM target, User source) {
        if (source.getUserInfo() != null) {
            UserInfoResVM userInfoResVM = userInfoMapper.mapBaseObjectToResponse(source.getUserInfo()).getData();
            target.setUserInfoResVM(userInfoResVM);
        }
    }
}
