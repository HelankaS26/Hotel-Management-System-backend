package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.RoomRepository;
import com.hotelmanagement.service.RoomServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements RoomServiceable {

    @Autowired
    private RoomRepository roomRepository;
}
