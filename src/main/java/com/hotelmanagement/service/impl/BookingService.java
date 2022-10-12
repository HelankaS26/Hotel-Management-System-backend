package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.BookingRepository;
import com.hotelmanagement.service.BookingServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService implements BookingServiceable {

    @Autowired
    private BookingRepository bookingRepository;
}
