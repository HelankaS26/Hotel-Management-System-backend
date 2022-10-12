package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}