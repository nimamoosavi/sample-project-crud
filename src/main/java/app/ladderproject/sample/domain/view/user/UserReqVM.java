package app.ladderproject.sample.domain.view.user;

import lombok.Data;

@Data
public class UserReqVM {
    private Long id;
    private String username;
    private String password;
    private Long userInfoId;
}
