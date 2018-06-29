package com.qa.tracker.service;

import java.util.List;

import com.qa.tracker.entity.Booking;

public interface BookingService {
	Booking getBookingById(Integer bookingId);
	List<Booking> getAllBookings();
	String editBookingById(String booking);
	String addBooking(String booking);
	String deletebooking(Integer bookingId);
	
}
