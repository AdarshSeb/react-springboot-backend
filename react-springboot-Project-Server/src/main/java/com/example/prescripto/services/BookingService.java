package com.example.prescripto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prescripto.entity.Booking;
import com.example.prescripto.repository.BookingRepository;
@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	
	public void bookDoctor(Booking bookingDetails) {
		bookingRepository.save(bookingDetails);
	}
	
	public Integer getCount(String docId, String date,String time) {
		return bookingRepository.findCount(docId,date,time);
		
	}
	

}
