package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    @Procedure(procedureName = "addEmployee")
    void addEmployee(
            String employeeType,
            String title,
            String nic,
            String firstName,
            String lastName,
            LocalDate dob,
            String sex,
            String telNo,
            String address,
            String email,
            BigDecimal basicSalary
    );

}