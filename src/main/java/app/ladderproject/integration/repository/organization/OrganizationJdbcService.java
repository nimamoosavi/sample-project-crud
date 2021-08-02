package app.ladderproject.integration.repository.organization;

import app.ladderproject.integration.domain.entity.Organization;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrganizationJdbcService extends JdbcServiceImpl<Organization, Long> {

}
