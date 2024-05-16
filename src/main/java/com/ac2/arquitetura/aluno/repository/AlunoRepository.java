package com.ac2.arquitetura.aluno.repository;

import com.ac2.arquitetura.aluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {



}
