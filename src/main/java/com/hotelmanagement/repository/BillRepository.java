package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Bill;
import com.hotelmanagement.entity.BillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, BillId> {
}