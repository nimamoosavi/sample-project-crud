package com.nicico.cost.integration.repository.people;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PeopleJdbcService extends JdbcServiceImpl<People, Long> {

    private final PeopleRepository peopleRepository;

    public Optional<People> findByNationCode(@NotNull String nationalCode) {
        return peopleRepository.findByNationalCode(nationalCode);
    }

}
