package entidades;

import java.util.ArrayList;

public class Aluno extends Usuario {

    private static ArrayList<Curso> cursosDoAluno;

    public Aluno(String nome, String email, String senha, String cpf, String dataNascimento) {
        super(nome, email, senha, cpf, dataNascimento);
    }

    public ArrayList<Curso> getCursos() {
        return cursosDoAluno;
    }

    public void setCursos(Curso salvarCurso) {
        this.cursosDoAluno.add(salvarCurso);
    }
    public void excluirCurso(Curso curso) {
        this.cursosDoAluno.remove(curso);
    }
}