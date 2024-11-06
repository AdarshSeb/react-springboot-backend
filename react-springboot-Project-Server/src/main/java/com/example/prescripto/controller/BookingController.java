package com.example.prescripto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prescripto.entity.Booking;
import com.example.prescripto.services.BookingService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:5173")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping
	public void createBooking(@RequestBody Booking bookingDetails) {

		bookingService.bookDoctor(bookingDetails);
	}

	@GetMapping("/count")
	public Integer getBookingCount(@Param("docId") String docId, @Param("date") String date,
			@Param("time") String time) {
		return bookingService.getCount(docId, date, time);
	}

}
