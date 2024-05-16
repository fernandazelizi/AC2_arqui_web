package com.ac2.arquitetura.aluno.controller;

import com.ac2.arquitetura.aluno.model.Aluno;
import com.ac2.arquitetura.aluno.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
@Validated

public class AlunoController {

    private final AlunoService alunoService;

    @GetMapping("/all")
    public List<Aluno> getAlunos() {
        return alunoService.getAlunos();
    }

    @GetMapping("/{id}")
    public Aluno getAluno(@PathVariable Long id) {
        return alunoService.getAlunoPorId(id);
    }

    @PostMapping("/add")
    public void addAluno(@Validated @RequestBody Aluno aluno) {
        alunoService.addAluno(aluno);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoService.deleteAluno(id);
    }
}