package app.ladderproject.integration.repository.people;

import app.ladderproject.integration.domain.entity.People;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeopleJdbcService extends JdbcServiceImpl<People, Long> {

    private final PeopleRepository peopleRepository;

    public Optional<People> findByNationCode(@NotNull String nationalCode) {
        return peopleRepository.findByNationalCode(nationalCode);
    }

}
