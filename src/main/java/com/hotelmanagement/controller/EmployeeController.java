package com.hotelmanagement.controller;

import com.hotelmanagement.domain.ResourceEmployeeDTO;
import com.hotelmanagement.domain.StoreEmployeeDTO;
import com.hotelmanagement.domain.UpdateEmployeeDTO;
import com.hotelmanagement.service.EmployeeServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceable employeeServiceable;

    @GetMapping()
    public List<ResourceEmployeeDTO> index() {
        return employeeServiceable.getAllEmployees();
    }

    @PostMapping()
    public ResponseEntity<Boolean> store(@RequestBody StoreEmployeeDTO storeEmployeeDTO) {
        return employeeServiceable.createEmployee(storeEmployeeDTO);
    }

    @GetMapping("/{id}")
    public ResourceEmployeeDTO show(@PathVariable String id) {
        return employeeServiceable.getEmployeeByID(id);
    }

    @PutMapping("/{id}")
    public Object update(@RequestBody UpdateEmployeeDTO updateEmployeeDTO) {
        return employeeServiceable.updateEmployee(updateEmployeeDTO);
    }

    @DeleteMapping("/{id}")
    public String destroy(@PathVariable String id) {
        return employeeServiceable.deleteEmployee(id);
    }
}
