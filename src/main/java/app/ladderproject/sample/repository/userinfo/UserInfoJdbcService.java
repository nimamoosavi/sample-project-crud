package app.ladderproject.sample.repository.userinfo;

import app.ladderproject.sample.domain.entity.UserInfo;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserInfoJdbcService extends JdbcServiceImpl<UserInfo, Long> {
}
