package app.ladderproject.sample.repository.userinfo;

import app.ladderproject.jdbcclient.repository.JdbcRepository;
import app.ladderproject.sample.domain.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JdbcRepository<UserInfo, Long> {

    Optional<UserInfo> findByName(String name);
}
