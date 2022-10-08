package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.BonusRepository;
import com.hotelmanagement.service.BonusServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusService implements BonusServiceable {

    @Autowired
    private BonusRepository bonusRepository;
}
