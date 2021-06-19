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

    public List<People> findByFirstName(@NotNull String firstName) {
        return peopleRepository.findAllByFirstName(firstName);
    }

    public List<People> findByFirstNameContaining(@NotNull String firstName) {
        return peopleRepository.findAllByFirstNameContaining(firstName);
    }

    public Page<People> findByFirstName(@NotNull String firstName, Pageable pageable) {
        return peopleRepository.findAllByFirstName(firstName,pageable);
    }

    public Page<People> findByFirstNameContaining(@NotNull String firstName, Pageable pageable) {
        return peopleRepository.findAllByFirstNameContaining(firstName,pageable);
    }

    public List<People> findByLastName(@NotNull String lastName) {
        return peopleRepository.findAllByLastName(lastName);
    }

    public List<People> findByLastNameContaining(@NotNull String lastName) {
        return peopleRepository.findAllByFirstNameContaining(lastName);
    }

    public Page<People> findByLastName(@NotNull String lastName, Pageable pageable) {
        return peopleRepository.findAllByLastName(lastName,pageable);
    }

    public Page<People> findByLastNameContaining(@NotNull String lastName, Pageable pageable) {
        return peopleRepository.findAllByLastNameContaining(lastName,pageable);
    }

}
