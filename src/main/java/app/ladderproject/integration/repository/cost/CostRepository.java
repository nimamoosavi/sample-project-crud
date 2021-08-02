package app.ladderproject.integration.repository.cost;


import app.ladderproject.integration.domain.entity.Cost;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JdbcRepository<Cost, Long> {
}
