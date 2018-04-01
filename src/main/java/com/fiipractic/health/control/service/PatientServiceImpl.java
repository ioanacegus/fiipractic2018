package com.fiipractic.health.control.service;


import com.fiipractic.health.boundry.exceptions.NotFoundException;
import com.fiipractic.health.entity.model.Patient;
import com.fiipractic.health.entity.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatient(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> findAllPatientsWithAge(Long patientAge) {
        return patientRepository.findByPatientAge(patientAge);
    }
}
