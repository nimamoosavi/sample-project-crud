package app.ladderproject.sample.service.impl;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;
import app.ladderproject.sample.service.UserService;
import org.springframework.stereotype.Service;


@Service
class UserServiceImpl extends GeneralServiceImpl<User, UserReqVM, UserResVM, Long> implements UserService {

    @Override
    public BaseDTO<UserResVM> save(UserReqVM userReqVM) {

        return super.save(userReqVM);
    }
}
