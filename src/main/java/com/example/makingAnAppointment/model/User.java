package com.example.makingAnAppointment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="address",nullable = true)
    private String address;
    @Column(name="phone_number",nullable = false)
    private String phoneNumber;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="password",nullable = false,unique = true)
    @JsonIgnore
    private String password;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @JsonIgnore
    private Set<Role> roles;
//    @OneToMany
//    @JoinColumn(name="test_id")
//    private List<MedicalTests> testsList;

}
