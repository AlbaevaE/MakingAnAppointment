package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription,Long> {
}
