package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.EmployeeRepository;
import com.hotelmanagement.service.EmployeeServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceable {

    @Autowired
    private EmployeeRepository employeeRepository;
}
