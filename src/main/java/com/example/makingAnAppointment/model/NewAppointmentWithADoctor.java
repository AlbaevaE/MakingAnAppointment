package com.example.makingAnAppointment.model;

import com.example.makingAnAppointment.enums.AppointmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "new_appointment")
public class NewAppointmentWithADoctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name="user_id")
    private User user;
    @JoinColumn(name="doctor_id")
    private Doctor doctor;
    private LocalDateTime time;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointment;


}
