package com.example.makingAnAppointment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doctor_name", nullable = false)
    private String doctorName;
    @OneToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialties;
    //    @Column(name="experience",nullable = false)
//    private String experience;
    @Column(name = "office", nullable = true)
    private Integer office;

}
