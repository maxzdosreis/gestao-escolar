package org.senac.gestao_escolar.service;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Aluno;
import org.senac.gestao_escolar.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long Id){
        return alunoRepository.findById(Id);
    }

    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public void excluir(Long id){
        alunoRepository.deleteById(id);
    }
}
