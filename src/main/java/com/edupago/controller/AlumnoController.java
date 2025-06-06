package com.edupago.controller;

import com.edupago.model.Alumno;
import com.edupago.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "*")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public List<Alumno> listar() {
        return alumnoService.listar();
    }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno alumno) {
        return alumnoService.guardar(alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}
// This controller handles requests related to "Alumno" entities.