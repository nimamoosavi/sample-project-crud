package com.webold.integration.repository.people;

import com.webold.integration.domain.entity.People;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
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
