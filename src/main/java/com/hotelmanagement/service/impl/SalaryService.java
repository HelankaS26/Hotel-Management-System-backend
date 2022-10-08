package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.SalaryRepository;
import com.hotelmanagement.service.SalaryServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService implements SalaryServiceable {

    @Autowired
    private SalaryRepository salaryRepository;
}
