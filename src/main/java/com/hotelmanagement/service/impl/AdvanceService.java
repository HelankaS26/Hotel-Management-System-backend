package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.AdvanceRepository;
import com.hotelmanagement.service.AdvanceServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvanceService implements AdvanceServiceable {

    @Autowired
    private AdvanceRepository advanceRepository;
}
