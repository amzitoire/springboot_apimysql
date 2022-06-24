package com.firstspring.apimysql.repository;

import com.firstspring.apimysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
