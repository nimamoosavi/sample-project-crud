package com.nicico.cost.integration.repository.department;

import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JdbcRepository<Department, Long> {
}
