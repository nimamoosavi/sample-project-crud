package app.ladderproject.sample.repository.userinfo;

import app.ladderproject.sample.domain.entity.UserInfo;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JdbcRepository<UserInfo, Long> {
}
