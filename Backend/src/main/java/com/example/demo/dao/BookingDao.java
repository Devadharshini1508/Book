package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Integer>{

	/*public List<Booking> findBybooking_idd(long booking_id);
	List<Booking> findByUseruserid(int userid);*/
	
}
