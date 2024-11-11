package com.example.prescripto.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	@Query(value = "select count(booking_id) from booking_table where doc_id = :docId AND date =:date AND time=:time", nativeQuery = true)
	public Integer findCount(String docId, String date,String time);

	@Query(value ="SELECT doc_id FROM booking_table  WHERE patient_id = :patientId",nativeQuery = true)
    List<Long> findDoctorIdsByPatientId(int patientId);

		
}
