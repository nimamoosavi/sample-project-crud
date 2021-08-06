package app.ladderproject.sample.domain.view.user;

import app.ladderproject.sample.domain.view.userinfo.UserInfoResVM;
import lombok.Data;

@Data
public class UserResVM {
    private Long id;
    private String username;
    private UserInfoResVM userInfoResVM;
}
