package com.nicico.cost.integration.repository.department;

import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentJdbcService extends JdbcServiceImpl<Department, Long> {

    private final DepartmentRepository departmentRepository;

    public Optional<Department> findByDepartmentCode(@NotNull String code) {
        return departmentRepository.findByDepartmentCode(code);
    }
}
