package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Reservation;
import com.hotelmanagement.entity.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, ReservationId> {
}