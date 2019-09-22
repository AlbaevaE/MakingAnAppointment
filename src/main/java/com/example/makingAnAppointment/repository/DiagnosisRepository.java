package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisRepository extends JpaRepository<Diagnosis,Long> {
}
