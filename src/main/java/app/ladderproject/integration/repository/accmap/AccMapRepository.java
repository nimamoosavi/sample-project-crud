package app.ladderproject.integration.repository.accmap;

import app.ladderproject.integration.domain.entity.AccMap;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccMapRepository extends JdbcRepository<AccMap, Long> {

    Optional<AccMap> findByCode(String code);
}
