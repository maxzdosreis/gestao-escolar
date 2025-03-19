package org.senac.gestao_escolar.repository;

import org.senac.gestao_escolar.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    
}
