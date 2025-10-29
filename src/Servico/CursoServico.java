package Servico;

import Repositorio.CursoRepositorio;
import entidades.Curso;
import gui.MenuProfessor;
import interfacess.Teste;

import java.util.Scanner;

public class CursoServico {

    CursoRepositorio repositoriocurso = new CursoRepositorio();
    MenuProfessor menuProfessor = new MenuProfessor();
    Teste addcurso = new Teste();

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
        this.repositoriocurso.salvarCurso(curso);
        System.out.println("Curso adicionado com sucesso!");

    }

    public void professorRemoverCursos(Scanner sc) {
       repositoriocurso.removeCurso();
        System.out.println("Curso removido com sucesso!");
    }

    public void professorVerCursos(Scanner sc){
        System.out.println("------------------- CURSOS DO PROFESSOR ---------------------");
        System.out.println("-------------------------------------------------------------");
        repositoriocurso.mostrarCurso();
    }

    public void alunoVerCursos(){
        System.out.println("------------------- CURSOS DO ALUNO ---------------------");
        System.out.println("---------------------------------------------------------");
        repositoriocurso.mostrarCursoDoaluno();
    }
}



