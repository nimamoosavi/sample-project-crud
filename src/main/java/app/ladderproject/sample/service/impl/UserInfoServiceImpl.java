package app.ladderproject.sample.service.impl;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.sample.domain.entity.UserInfo;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
import app.ladderproject.sample.repository.userinfo.UserInfoJdbcService;
import app.ladderproject.sample.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static app.ladderproject.sample.exception.IntegrationException.USERNAME_NOT_FOUND;

@Service
@RequiredArgsConstructor
class UserInfoServiceImpl extends GeneralServiceImpl<UserInfo, UserInfoReqVM, UserInfoResVM, Long> implements UserInfoService {

    private final UserInfoJdbcService userInfoJdbcService;


    @Override
    public BaseDTO<UserInfoResVM> findByName(String name) {
        UserInfo userInfo = userInfoJdbcService.findByName(name).orElseThrow(
                () -> applicationException.createApplicationException(USERNAME_NOT_FOUND)
        );
        return generalMapper.mapBaseObjectToResponse(userInfo);
    }
}
