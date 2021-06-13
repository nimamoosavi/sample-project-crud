package com.nicico.cost.integration.repository.organization;

import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JdbcRepository<Organization, Long> {
}
