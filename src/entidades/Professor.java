package entidades;

import java.util.ArrayList;


public class Professor extends Usuario {

    private String qualificacoes;
    private String curso;

    private ArrayList<Curso> cursosDoProfessor;

    public Professor(String nome, String cpf,  String dataNascimento, String email,  String senha, String qualificacoes) {
        super(nome, cpf, dataNascimento, email, senha);
        this.qualificacoes = qualificacoes;

    }

    public String getQualificacoes() {
        return qualificacoes;
    }

    public void setQualificacoes(String qualificacoes) {
        this.qualificacoes = qualificacoes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}