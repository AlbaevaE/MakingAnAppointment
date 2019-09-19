package com.example.makingAnAppointment.repository;

import com.example.makingAnAppointment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
