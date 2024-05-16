package com.ac2.arquitetura.aluno.service;

import java.util.List;
import com.ac2.arquitetura.aluno.model.Aluno;
import com.ac2.arquitetura.aluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno getAlunoPorId(Long id) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        return optionalAluno.orElse(null);
    }

    @Override
    public void addAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @Override
    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}