package app.ladderproject.sample.repository.user;


import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;



@Service
public class UserJdbcService extends JdbcServiceImpl<User, Long> {

}
