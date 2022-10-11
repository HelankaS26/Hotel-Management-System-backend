package com.hotelmanagement.service;

import com.hotelmanagement.domain.ResourceEmployeeDTO;
import com.hotelmanagement.domain.StoreEmployeeDTO;
import com.hotelmanagement.domain.UpdateEmployeeDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceable {
    List<ResourceEmployeeDTO> getAllEmployees();

    ResponseEntity<Boolean> createEmployee(StoreEmployeeDTO storeEmployeeDTO);

    ResourceEmployeeDTO getEmployeeByID(String id);

    Object updateEmployee(UpdateEmployeeDTO updateEmployeeDTO);

    String deleteEmployee(String id);
}
