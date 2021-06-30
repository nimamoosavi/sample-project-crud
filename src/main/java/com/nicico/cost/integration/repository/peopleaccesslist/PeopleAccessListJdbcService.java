package com.nicico.cost.integration.repository.peopleaccesslist;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PeopleAccessListJdbcService extends JdbcServiceImpl<PeopleAccessList, Long> {

    private final PeopleAccessListRepository peopleAccessListRepository;

    public Optional<PeopleAccessList> findByPeopleIdAndOrganizationId(Long peopleId, Long organizationId){
        return peopleAccessListRepository.findByPeopleIdAndOrganizationId(peopleId, organizationId);
    }

    public Boolean existsByPeopleIdAndOrganizationId(Long peopleId, Long organizationId){
        return peopleAccessListRepository.existsByPeopleIdAndOrganizationId(peopleId, organizationId);
    }

    public List<PeopleAccessList> findAllByPeople_IdAndWriteAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeople_IdAndWriteAccessTrue(peopleId);
    }

    public List<PeopleAccessList> findAllByPeople_IdAndReadAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeople_IdAndReadAccessTrue(peopleId);
    }
}
