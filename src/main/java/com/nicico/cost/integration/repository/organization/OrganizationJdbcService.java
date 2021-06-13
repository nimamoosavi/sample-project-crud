package com.nicico.cost.integration.repository.organization;

import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrganizationJdbcService extends JdbcServiceImpl<Organization, Long> {

}
