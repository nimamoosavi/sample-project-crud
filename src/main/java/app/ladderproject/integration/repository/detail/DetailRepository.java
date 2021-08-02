package app.ladderproject.integration.repository.detail;

import app.ladderproject.integration.domain.entity.Detail;
import app.ladderproject.jdbcclient.repository.TreeJdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailRepository extends TreeJdbcRepository<Detail, Long> {
}
