package com.example.makingAnAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewAppointmentWithADoctor extends JpaRepository<NewAppointmentWithADoctor,Long> {
}
