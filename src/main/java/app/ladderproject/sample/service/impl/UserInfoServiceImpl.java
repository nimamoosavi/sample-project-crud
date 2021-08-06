package app.ladderproject.sample.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.sample.domain.entity.UserInfo;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
import app.ladderproject.sample.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
class UserInfoServiceImpl extends GeneralServiceImpl<UserInfo, UserInfoReqVM, UserInfoResVM, Long> implements UserInfoService {
}
