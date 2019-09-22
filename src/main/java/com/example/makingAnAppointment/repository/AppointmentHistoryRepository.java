package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.AppointmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentHistoryRepository extends JpaRepository<AppointmentHistory,Long> {
}
