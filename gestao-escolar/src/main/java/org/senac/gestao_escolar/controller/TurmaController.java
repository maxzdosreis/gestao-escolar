package org.senac.gestao_escolar.controller;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Turma;
import org.senac.gestao_escolar.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/turmas")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> listarTurmas(){
        return turmaService.listarTurmas();
    }

    @GetMapping("/{id}")
    public Optional<Turma> buscarPorId(@PathVariable Long id) {
        return turmaService.buscarPorId(id);
    }

    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        turmaService.excluir(id);
    }
}
