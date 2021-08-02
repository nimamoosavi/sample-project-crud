package app.ladderproject.integration.repository.department;

import app.ladderproject.integration.domain.entity.Department;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface DepartmentRepository extends JdbcRepository<Department, Long> {
    Optional<Department> findByDepartmentCode(Long code);
}
