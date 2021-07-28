package com.webold.integration.repository.department;

import com.webold.integration.domain.entity.Department;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface DepartmentRepository extends JdbcRepository<Department, Long> {
    Optional<Department> findByDepartmentCode(Long code);
}
