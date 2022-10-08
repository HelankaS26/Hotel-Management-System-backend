package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.BillRepository;
import com.hotelmanagement.service.BillServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService implements BillServiceable {

    @Autowired
    private BillRepository billRepository;
}
