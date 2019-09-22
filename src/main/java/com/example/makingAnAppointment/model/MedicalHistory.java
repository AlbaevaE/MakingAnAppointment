package com.example.makingAnAppointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="medical_history")
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;
    @OneToMany
    @JoinColumn(name="test_id")
    private MedicalTests test;
    @OneToMany
    @JoinColumn(name="diagnosis_id")
    private Diagnosis diagnosis;
    @OneToMany
    @JoinColumn(name="prescription_id")
    private Prescription prescription;


}
