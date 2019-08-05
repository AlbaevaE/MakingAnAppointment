package com.example.makingAnAppointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="doctor_name",nullable = false)
    private String doctorName;
    @Column(name="specialization",nullable = false)
    private String specialization;
    @Column(name="experience",nullable = false)
    private String experience;


}
