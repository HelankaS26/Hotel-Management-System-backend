package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.ItemRepository;
import com.hotelmanagement.service.ItemServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService implements ItemServiceable {

    @Autowired
    private ItemRepository itemRepository;
}
