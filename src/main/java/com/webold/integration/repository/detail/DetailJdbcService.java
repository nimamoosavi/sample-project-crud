package com.webold.integration.repository.detail;

import com.webold.integration.domain.entity.Detail;
import com.webold.jdbcclient.service.impl.TreeJdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetailJdbcService extends TreeJdbcServiceImpl<Detail, Long> {
}
