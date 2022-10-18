package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @GetMapping
    public List<PatientEntity> getAllRecords() {
        return patientRepository.findAll();
    }

    @GetMapping(value = "{patientId}")
    public PatientEntity getPatientById(@PathVariable(value="patientId") Long patientId) {
        return patientRepository.findById(patientId).get();
    }

}
