package com.example.prescripto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.CancelledBooking;


@Repository
public interface CancelledBookingRepository extends JpaRepository<CancelledBooking, Integer>{

}
