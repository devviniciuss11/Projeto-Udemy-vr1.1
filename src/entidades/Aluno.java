package entidades;

import java.util.ArrayList;

public class Aluno extends Usuario {

    private ArrayList<Curso> cursosDoAluno;

    public Aluno(String nome, String email, String senha, String cpf, String dataNascimento) {
        super(nome, email, senha, cpf, dataNascimento);
        this.cursosDoAluno = new ArrayList<>();
    }
    public Aluno() {
        super("Nome", "Email"  );
        this.cursosDoAluno = new ArrayList<>();
    }

    public Aluno(String nome, String email) {
        super(nome, email);
        this.cursosDoAluno = new ArrayList<>();
    }


    @Override
    public void senha() {
        System.out.println("Sua senha Pra Realizar o Login: "+ getSenha());

    }
    @Override
    public void email() {
        System.out.println("Seu Email Pra Realizar o Login: "+ getEmail());
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