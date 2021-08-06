package app.ladderproject.sample.service.impl;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.core.utility.GeneralUtility;
import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.sample.domain.view.user.UserReqVM;
import app.ladderproject.sample.domain.view.user.UserResVM;
import app.ladderproject.sample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
class UserServiceImpl extends GeneralServiceImpl<User, UserReqVM, UserResVM, Long> implements UserService {

    private final GeneralUtility generalUtility;

    @Override
    public BaseDTO<UserResVM> save(UserReqVM userReqVM) {
        String hashPass = generalUtility.hash(userReqVM.getPassword()).getData();
        userReqVM.setPassword(hashPass);
        return super.save(userReqVM);
    }
}
