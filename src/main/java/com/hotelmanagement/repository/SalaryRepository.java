package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, String> {
}