package com.edupago.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Alumno {
    @Id @GeneratedValue
    private Long id;

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;
}
