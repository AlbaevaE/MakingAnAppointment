package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory,Long> {
}
