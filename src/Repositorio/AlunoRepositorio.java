package Repositorio;
import java.util.ArrayList;
import entidades.Aluno;


public class AlunoRepositorio {
    public static ArrayList <Aluno> alunolist = new ArrayList<>();



    public void salvar(Aluno aluno) {
        alunolist.add(aluno);
    }


    public void mostrarAlunos() {
        for (int i = 0; i <alunolist.size(); i++) {
            System.out.println("-------------------Lista de todos os alunos-----------------------");
            System.out.println(i + 1 + "° Aluno Cadastrado ");
            System.out.println("Nome: " + alunolist.get(i).getNome());
            System.out.println("Email: " + alunolist.get(i).getEmail());
        }
    }


    public boolean verificarAlunoPorEmail(String email) {
        for (Aluno aluno : alunolist) {
            if (aluno.getEmail().equalsIgnoreCase(email)) {
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

