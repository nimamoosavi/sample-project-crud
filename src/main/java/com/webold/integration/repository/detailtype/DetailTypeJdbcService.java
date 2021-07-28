package com.webold.integration.repository.detailtype;

import com.webold.integration.domain.entity.DetailType;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DetailTypeJdbcService extends JdbcServiceImpl<DetailType, Long> {
}
