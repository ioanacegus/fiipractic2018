package com.fiipractic.health.entity.repository;


import com.fiipractic.health.entity.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    public List<Patient> findByPatientAge(Long patientAge);

    public List<Patient> findAllByPatientName(String patientName);

    public List<Patient> findAllByPatientNameAndPatientAge(String patientName, Long patientAge);


}
