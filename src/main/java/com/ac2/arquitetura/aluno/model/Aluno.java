package com.ac2.arquitetura.aluno.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do aluno é obrigatório")
    private String nome;

    @NotBlank(message = "O RA do aluno é obrigatório")
    private String alunoRa;

    @NotBlank(message = "A idade do aluno é obrigatória")
    @Pattern(regexp = "\\d+", message = "A idade do aluno deve ser um número")
    private String idade;

    @NotBlank(message = "O e-mail do aluno é obrigatório")
    @Email(message = "O e-mail do aluno deve ser válido")
    private String email;

    @NotBlank(message = "A nacionalidade do aluno é obrigatória")
    private String nacionalidade;

}