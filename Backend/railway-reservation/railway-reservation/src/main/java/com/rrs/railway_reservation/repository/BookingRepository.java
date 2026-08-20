package com.rrs.railway_reservation.repository;

import com.rrs.railway_reservation.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
