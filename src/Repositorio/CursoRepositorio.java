package Repositorio;

import entidades.Aluno;
import entidades.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class CursoRepositorio {
    private static ArrayList<Curso> cursolist = new ArrayList<Curso>();
    private Scanner sc1 = new Scanner(System.in);
    private static ArrayList<Curso> cursosDoAluno = new ArrayList<Curso>();

    public void salvarCurso(Curso curso){
        cursolist.add(curso);
    }


    public static void mostrarCurso() {
        for (int i = 0; i < cursolist.size(); i++) {
            System.out.println(cursolist.get(i).getCursoNome());
        }
    }

    public Curso removeCurso() {
        System.out.println("Qual Curso voce deseja excluir do cadastro? Digite o Nome do Curso");
        String excluirdocurso = sc1.nextLine();
        Curso cursoEncontrado = null;
        for (Curso curso : cursolist) {
            if (curso.getCursoNome().equals(excluirdocurso));{
                cursoEncontrado = curso;
                break;
            }
        }
        if(cursoEncontrado != null){
            System.out.println("Procurando Curso....");
            cursolist.remove(cursoEncontrado);


        }
        else{
            System.out.println("Curso não encontrado!");
        }
        return cursoEncontrado;
    }

    public static Curso verificarCursoPorNome(String nome){
        for (Curso curso : cursolist) {
            if (curso.getCursoNome().equals(nome)) {
                return curso;


            }
        }
        System.out.println("Curso "+ nome +" nao encontrado!");
        return null;

    }
    public void mostrarCursosDoAluno(Aluno aluno) {
        ArrayList<Curso> cursosDoAluno = aluno.getCursos();
        if (cursosDoAluno.isEmpty()) {
            System.out.println("Você ainda não está matriculado em nenhum curso.");
        } else {
            System.out.println("Você está matriculado nos seguintes cursos:");
            for (Curso curso : cursosDoAluno) {
                System.out.println("- " + curso.getCursoNome());
            }
        }

}}