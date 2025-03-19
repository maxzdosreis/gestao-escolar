package org.senac.gestao_escolar.service;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Turma;
import org.senac.gestao_escolar.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> listarTurmas(){
        return turmaRepository.findAll();
    }

    public Optional<Turma> buscarPorId(Long id){
        return turmaRepository.findById(id);
    }

    public Turma salvar(Turma turma){
        return turmaRepository.save(turma);
    }

    public void excluir(Long id){
        turmaRepository.deleteById(id);
    }
}
