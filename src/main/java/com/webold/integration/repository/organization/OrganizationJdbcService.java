package com.webold.integration.repository.organization;

import com.webold.integration.domain.entity.Organization;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrganizationJdbcService extends JdbcServiceImpl<Organization, Long> {

}
