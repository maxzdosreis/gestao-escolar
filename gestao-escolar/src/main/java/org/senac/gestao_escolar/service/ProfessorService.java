package org.senac.gestao_escolar.service;

import java.util.List;
import java.util.Optional;

import org.senac.gestao_escolar.model.Professor;
import org.senac.gestao_escolar.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> listarProfessores(){
        return professorRepository.findAll();
    }

    public Optional<Professor> buscarPorId(Long Id){
        return professorRepository.findById(Id);
    }

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    public void excluir(Long id){
        professorRepository.deleteById(id);
    }
}
