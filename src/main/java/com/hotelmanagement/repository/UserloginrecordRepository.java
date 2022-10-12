package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Userloginrecord;
import com.hotelmanagement.entity.UserloginrecordId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserloginrecordRepository extends JpaRepository<Userloginrecord, UserloginrecordId> {
}