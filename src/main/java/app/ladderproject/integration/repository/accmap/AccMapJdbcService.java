package app.ladderproject.integration.repository.accmap;

import app.ladderproject.integration.domain.entity.AccMap;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AccMapJdbcService extends JdbcServiceImpl<AccMap, Long> {

    private final AccMapRepository accMapRepository;

    public Optional<AccMap> findByCode(String code) {
        return accMapRepository.findByCode(code);
    }

}
