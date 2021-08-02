package app.ladderproject.integration.repository.people;

import app.ladderproject.integration.domain.entity.People;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface PeopleRepository extends JdbcRepository<People, Long> {
    Optional<People> findByNationalCode(String nationalCode);

}
