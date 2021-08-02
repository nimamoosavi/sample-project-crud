package app.ladderproject.integration.repository.organization;

import app.ladderproject.integration.domain.entity.Organization;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrganizationRepository extends JdbcRepository<Organization, Long> {
}
