package app.ladderproject.integration.repository.peopleaccesslist;

import app.ladderproject.integration.domain.entity.PeopleAccessList;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface PeopleAccessListRepository extends JdbcRepository<PeopleAccessList, Long> {

    List<PeopleAccessList> findAllByPeopleIdAndWriteAccessTrue(Long peopleId);

    List<PeopleAccessList> findAllByPeopleIdAndReadAccessTrue(Long peopleId);


}
