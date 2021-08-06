package app.ladderproject.sample.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;

public interface UserInfoService extends GeneralService<UserInfoReqVM, UserInfoResVM, Long> {
}
