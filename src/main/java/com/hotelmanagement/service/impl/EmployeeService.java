package com.hotelmanagement.service.impl;

import com.hotelmanagement.domain.ResourceEmployeeDTO;
import com.hotelmanagement.domain.StoreEmployeeDTO;
import com.hotelmanagement.domain.UpdateEmployeeDTO;
import com.hotelmanagement.entity.Employee;
import com.hotelmanagement.mapper.ResourceEmployeeMapper;
import com.hotelmanagement.mapper.StoreEmployeeMapper;
import com.hotelmanagement.repository.EmployeeRepository;
import com.hotelmanagement.service.EmployeeServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceable {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private StoreEmployeeMapper storeEmployeeMapper;
    @Autowired
    private ResourceEmployeeMapper resourceEmployeeMapper;

    @Override
    public List<ResourceEmployeeDTO> getAllEmployees() {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> createEmployee(StoreEmployeeDTO storeEmployeeDTO) {
        Employee employee = storeEmployeeMapper.storeEmployeeDTOToEmployee(storeEmployeeDTO);
        employeeRepository.addEmployee(
                employee.getEmployeeType(),
                employee.getTitle(),
                employee.getNic(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getDob(),
                employee.getSex(),
                employee.getTelNo(),
                employee.getAddress(),
                employee.getEmail(),
                employee.getBasicSalary()
        );
        return ResponseEntity.ok(true);
    }

    @Override
    public ResourceEmployeeDTO getEmployeeByID(String id) {
        return null;
    }

    @Override
    public Object updateEmployee(UpdateEmployeeDTO updateEmployeeDTO) {
        return null;
    }

    @Override
    public String deleteEmployee(String id) {
        return null;
    }
}
