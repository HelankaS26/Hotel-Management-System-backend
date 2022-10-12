package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.GuestRepository;
import com.hotelmanagement.service.GuestServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements GuestServiceable {

    @Autowired
    private GuestRepository guestRepository;
}
