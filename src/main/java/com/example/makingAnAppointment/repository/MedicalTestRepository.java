package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.MedicalTests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalTestRepository extends JpaRepository<MedicalTests,Long> {
}
