package app.ladderproject.integration.repository.detailtype;

import app.ladderproject.integration.domain.entity.DetailType;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DetailTypeRepository extends JdbcRepository<DetailType, Long> {
}
