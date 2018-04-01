package com.fiipractic.health.entity.repository;


import com.fiipractic.health.entity.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
