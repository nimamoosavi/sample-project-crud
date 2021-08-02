package app.ladderproject.integration.repository.cost;

import app.ladderproject.integration.domain.entity.Cost;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CostJdbcService extends JdbcServiceImpl<Cost, Long> {
}
