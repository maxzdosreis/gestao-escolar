package org.senac.gestao_escolar.repository;

import org.senac.gestao_escolar.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
