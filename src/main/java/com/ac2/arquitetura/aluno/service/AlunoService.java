package com.ac2.arquitetura.aluno.service;

import com.ac2.arquitetura.aluno.model.Aluno;

import java.util.List;

public interface AlunoService {

    public List<Aluno> getAlunos();
    public Aluno getAlunoPorId(Long id);
    public void addAluno(Aluno id);
    public void deleteAluno(Long id);
}
