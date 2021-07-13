package com.nicico.cost.integration.repository.cost;

import com.nicico.cost.integration.domain.entity.Cost;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CostJdbcService extends JdbcServiceImpl<Cost, Long> {
}
