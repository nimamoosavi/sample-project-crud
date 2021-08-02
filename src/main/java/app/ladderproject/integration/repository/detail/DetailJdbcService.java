package app.ladderproject.integration.repository.detail;

import app.ladderproject.integration.domain.entity.Detail;
import app.ladderproject.jdbcclient.service.impl.TreeJdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetailJdbcService extends TreeJdbcServiceImpl<Detail, Long> {
}
