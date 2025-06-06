package com.edupago.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Matricula {
    
    @Id @GeneratedValue
    private Long id;

    private LocalDate fecha;
    private Integer año;
    
}
