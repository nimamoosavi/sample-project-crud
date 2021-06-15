package com.nicico.cost.integration.repository.department;

import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DepartmentJdbcService extends JdbcServiceImpl<Department, Long> {
}
