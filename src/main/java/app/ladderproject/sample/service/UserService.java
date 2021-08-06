package app.ladderproject.sample.service;


import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;

public interface UserService extends GeneralService<UserReqVM, UserResVM, Long> {

}
