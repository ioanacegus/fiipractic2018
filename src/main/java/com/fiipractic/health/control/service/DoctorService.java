package com.fiipractic.health.control.service;

import com.fiipractic.health.boundry.exceptions.NotFoundException;
import com.fiipractic.health.entity.model.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> getDoctors();

    Doctor getDoctor(Long id);

    Doctor updateDoctor(Doctor doctor) throws NotFoundException;

    void deleteDoctor(Doctor doctor);

    Doctor saveDoctor(Doctor doctor);
}
