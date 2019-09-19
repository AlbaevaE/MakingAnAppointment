package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty,Long> {
}
