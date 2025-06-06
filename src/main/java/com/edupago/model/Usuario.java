package com.edupago.model;

import org.apache.commons.math3.analysis.function.Identity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private String correo;
    private String contraseña;
    private String rol;
}
