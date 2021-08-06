package app.ladderproject.sample.service;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.sample.domain.view.userinfo.UserInfoReqVM;
import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;

import javax.validation.constraints.NotBlank;

public interface UserInfoService extends GeneralService<UserInfoReqVM, UserInfoResVM, Long> {
    BaseDTO<UserInfoResVM> findByName(@NotBlank String name);
}
