package com.edupago.service;

import com.edupago.model.Matricula;
import com.edupago.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }

    public Matricula guardar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public void eliminar(Long id) {
        matriculaRepository.deleteById(id);
    }
}
