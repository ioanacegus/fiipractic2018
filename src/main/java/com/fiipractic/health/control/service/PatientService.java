package com.fiipractic.health.control.service;


import com.fiipractic.health.entity.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getPatients();

    Patient getPatient(Long id);

    Patient updatePatient(Patient patient);

    void deletePatient(Patient patient);

    Patient savePatient(Patient patient);

    List<Patient> findAllPatientsWithAge(Long patientAge);
}
