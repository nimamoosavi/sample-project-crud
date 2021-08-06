package app.ladderproject.sample.repository.user;

import app.ladderproject.sample.domain.entity.User;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JdbcRepository<User, Long> {
}
