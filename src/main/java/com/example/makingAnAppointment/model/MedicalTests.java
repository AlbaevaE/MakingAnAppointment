package com.example.makingAnAppointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="medical_tests")
public class MedicalTests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="test",nullable = false)
    private String test;
    @OneToMany
    @JoinColumn(name="user_id")
    private List<User> user;

}
