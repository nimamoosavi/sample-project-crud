package app.ladderproject.sample.mapper;


import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.sample.domain.entity.UserInfo;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class UserInfoMapper extends GeneralMapper<UserInfo, UserInfoReqVM, UserInfoResVM> {
}
