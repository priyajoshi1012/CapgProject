package com.cg.bookmydoctor.dao;

import java.time.LocalDate;  
import java.util.List;

import com.cg.bookmydoctor.dto.Appointment;
import com.cg.bookmydoctor.dto.AvailabilityDates;
import com.cg.bookmydoctor.dto.Doctor;
import com.cg.bookmydoctor.dto.FeedBack;
import com.cg.bookmydoctor.dto.Patient;
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientDao  extends CrudRepository<Patient, Integer> {

	/*public Patient addPatient(Patient bean);
	public Patient editPatientProfile(Patient bean);
	public Patient removePatientDetails(Patient bean);
	public Patient getPatient(Patient patient);
	public List<Patient> getAllPatient();
	public List<Patient> getPatientListByDoctor(Doctor doctor);
	public List<Patient> getPatientListByDate(LocalDate appdate);*/
}
