package com.nicico.cost.integration.repository.detailtype;

import com.nicico.cost.integration.domain.entity.DetailType;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DetailTypeJdbcService extends JdbcServiceImpl<DetailType, Long> {
}
