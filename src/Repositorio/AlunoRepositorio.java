package Repositorio;
import java.util.ArrayList;
import entidades.Aluno;
import java.util.Scanner;

public class AlunoRepositorio {
    private static ArrayList <Aluno> alunolist = new ArrayList<>();



    public void salvar(Aluno aluno) {
        alunolist.add(aluno);
    }


    public boolean verificarAlunoPorEmail(String email) {
        for (Aluno aluno : alunolist) {
            if (aluno.getCpf().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
    public boolean verificarAlunoPorCpf(String cpf) {
        for (Aluno aluno : alunolist) {
            if (aluno.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public Aluno loginAluno(String email, String senha) {
        for (Aluno aluno : alunolist) {
            if (aluno.getEmail().equals(email) && aluno.getSenha().equals(senha)) return aluno;
        }
        return null;
    }


}

