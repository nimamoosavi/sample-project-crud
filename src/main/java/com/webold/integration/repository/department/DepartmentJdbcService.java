package com.webold.integration.repository.department;

import com.webold.integration.domain.entity.Department;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentJdbcService extends JdbcServiceImpl<Department, Long> {

    private final DepartmentRepository departmentRepository;

    public Optional<Department> findByDepartmentCode(@NotNull Long code) {
        return departmentRepository.findByDepartmentCode(code);
    }
}
