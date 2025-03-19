package org.senac.gestao_escolar.controller;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Disciplina;
import org.senac.gestao_escolar.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/disciplinas")
public class DisciplinaController {
    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> listarDisciplinas(){
        return disciplinaService.listarDisciplinas();
    }

    @GetMapping("/{id}")
    public Optional<Disciplina> buscarPorId(@PathVariable Long id) {
        return disciplinaService.buscarPorId(id);
    }

    @PostMapping
    public Disciplina salvar(@RequestBody Disciplina disciplina) {
        return disciplinaService.salvar(disciplina);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        disciplinaService.excluir(id);
    }
}
