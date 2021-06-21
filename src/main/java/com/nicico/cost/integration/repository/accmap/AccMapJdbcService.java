package com.nicico.cost.integration.repository.accmap;

import com.nicico.cost.framework.service.exception.ApplicationException;
import com.nicico.cost.framework.service.exception.ServiceException;
import com.nicico.cost.integration.domain.entity.AccMap;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccMapJdbcService extends JdbcServiceImpl<AccMap, Long> {
    private final AccMapRepository accMapRepository;
    private final ApplicationException<ServiceException> applicationException;

}
