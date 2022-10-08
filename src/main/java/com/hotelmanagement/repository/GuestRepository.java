package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, String> {
}