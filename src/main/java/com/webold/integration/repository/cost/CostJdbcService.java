package com.webold.integration.repository.cost;

import com.webold.integration.domain.entity.Cost;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CostJdbcService extends JdbcServiceImpl<Cost, Long> {
}
