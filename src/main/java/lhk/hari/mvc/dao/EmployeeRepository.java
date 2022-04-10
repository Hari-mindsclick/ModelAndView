package lhk.hari.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lhk.hari.mvc.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
