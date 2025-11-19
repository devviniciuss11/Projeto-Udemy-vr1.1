package Servico;

import Repositorio.CursoRepositorio;
import entidades.Aluno;
import entidades.Curso;


import java.util.Scanner;

public class CursoServico {

    CursoRepositorio repositoriocurso = new CursoRepositorio();


    public void professorAdicionarCurso(Scanner sc){
        System.out.println("Digite o nome do curso: ");
        String cursoName = sc.nextLine();
        System.out.println("Digite o descricao do curso: ");
        String cursoDescricao = sc.nextLine();
        System.out.println("Digite a carga horaria do curso: ");
        String cargaHoraria = sc.nextLine();
        System.out.println("Digite o valor do curso: ");
        String valorDoCurso = sc.nextLine();
        Curso curso = new Curso(cursoName, cursoDescricao, cargaHoraria, valorDoCurso);
        this.repositoriocurso.salvarCursoDoProfessor(curso);
        System.out.println("Curso adicionado com sucesso!");

    }

    public void professorRemoverCursos(Scanner sc) {
       repositoriocurso.removeCurso();
        System.out.println("Curso removido com sucesso!");
    }

    public void professorVerCursos(){
        System.out.println("------------------- CURSOS DO PROFESSOR ---------------------");
        System.out.println("-------------------------------------------------------------");
        repositoriocurso.mostrarCurso();
    }

    public void alunoVerCursos(Aluno aluno){
        System.out.println("------------------- CURSOS DO ALUNO ---------------------");
        System.out.println("---------------------------------------------------------");
        repositoriocurso.mostrarCursosDoAluno(aluno);
    }

}



