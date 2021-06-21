package com.nicico.cost.integration.repository.detail;

import com.nicico.cost.integration.domain.entity.Detail;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DetailJdbcService extends JdbcServiceImpl<Detail, Long> {
}
