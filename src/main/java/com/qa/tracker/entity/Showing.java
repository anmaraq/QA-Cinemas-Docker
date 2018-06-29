package com.qa.tracker.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Showing {


	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer showingId;
	@Column
	private Date date;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Booking> bookings = new HashSet<Booking>();
	
	public Showing() {}
	
	public Showing(Date date) {
		this.date = date;
	}

	public Integer getShowingId() {
		return showingId;
	}
	public void setShowingId(Integer showingId) {
		this.showingId = showingId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Set<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	public void addBooking(Booking booking) {
		this.bookings.add(booking);
	}

}
