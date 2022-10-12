package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.ReservationRepository;
import com.hotelmanagement.service.ReservationServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService implements ReservationServiceable {

    @Autowired
    private ReservationRepository reservationRepository;
}
