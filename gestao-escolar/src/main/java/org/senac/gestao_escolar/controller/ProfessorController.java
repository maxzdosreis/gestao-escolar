package org.senac.gestao_escolar.controller;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Professor;
import org.senac.gestao_escolar.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listarProfessores(){
        return professorService.listarProfessores();
    }

    @GetMapping("/{id}")
    public Optional<Professor> buscarPorId(@PathVariable Long id) {
        return professorService.buscarPorId(id);
    }

    @PostMapping
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        professorService.excluir(id);
    }
}
