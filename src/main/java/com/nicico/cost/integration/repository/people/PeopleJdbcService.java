package com.nicico.cost.integration.repository.people;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PeopleJdbcService extends JdbcServiceImpl<People, Long> {
}
