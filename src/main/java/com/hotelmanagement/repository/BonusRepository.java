package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BonusRepository extends JpaRepository<Bonus, Integer> {
}