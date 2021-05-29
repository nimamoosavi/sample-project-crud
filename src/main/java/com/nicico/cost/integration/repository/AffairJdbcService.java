package com.nicico.cost.integration.repository;


import com.nicico.cost.integration.domain.entity.Affair;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AffairJdbcService extends JdbcServiceImpl<Affair, Long> {
}
