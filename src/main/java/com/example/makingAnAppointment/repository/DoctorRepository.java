package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
