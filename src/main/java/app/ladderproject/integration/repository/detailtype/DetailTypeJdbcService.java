package app.ladderproject.integration.repository.detailtype;

import app.ladderproject.integration.domain.entity.DetailType;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DetailTypeJdbcService extends JdbcServiceImpl<DetailType, Long> {
}
