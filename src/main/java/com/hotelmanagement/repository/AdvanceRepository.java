package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Advance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvanceRepository extends JpaRepository<Advance, Integer> {
}