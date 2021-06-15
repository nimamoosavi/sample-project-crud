package com.nicico.cost.integration.repository.department;

import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JdbcRepository<Department, Long> {
    Optional<Department> findByDepartmentCode(String code);
}
