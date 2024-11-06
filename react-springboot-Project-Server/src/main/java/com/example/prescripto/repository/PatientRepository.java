package com.example.prescripto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.prescripto.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	@Query(value = "SELECT * FROM patient_table WHERE patient_email =:emailId AND patient_password =:patientPassword", nativeQuery = true)
    Patient findUser(String emailId, String patientPassword);

}
