package org.senac.gestao_escolar.repository;

import org.senac.gestao_escolar.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
    
}
