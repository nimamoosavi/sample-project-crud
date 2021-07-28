package com.webold.integration.repository.organization;

import com.webold.integration.domain.entity.Organization;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrganizationRepository extends JdbcRepository<Organization, Long> {
}
