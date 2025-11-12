package Repositorio;
import java.util.ArrayList;
import entidades.Professor;
import java.util.Scanner;

public class ProfessorRepositorio {

    private static ArrayList <Professor> professorlist = new ArrayList<>();

    private Scanner InputDoProfessor = new Scanner (System.in);

    public void salvar (Professor professor) {
        professorlist.add(professor);
    }



    public void mostrando_Professor() {
        System.out.println("Mostrando Professor: ");
        for (int i = 0; i < professorlist.size(); i++) {
            System.out.println(
                    i + 1 + " °: " + professorlist.get(i).getNome() + "\nCPF: " + professorlist.get(i).getCpf() + "\nData: " +
                            professorlist.get(i).getDataNascimento() + "\nTurno: " + professorlist.get(i).getCurso());
        }
    }

    public void excluirProfessor() {
        System.out.println("Qual Professor você deseja excluir do cadastro? Digite o CPF:");
        String excluindoprofessor = InputDoProfessor.nextLine();
        Professor professorEncontrado = null;

        for (Professor professor : professorlist) {
            if (professor.getCpf().equalsIgnoreCase(excluindoprofessor)) {
                professorEncontrado = professor;

                break;
            }
        }

        if (professorEncontrado != null) {
            System.out.println("Procurando Professor....");
            professorlist.remove(professorEncontrado);
            System.out.println("O Professor foi excluído com sucesso.\n");
        } else {
            System.out.println("Professor não encontrado. Tente novamente!\n");
        }

    }

    public Professor loginProfessor(String email, String senha) {
        for (Professor professor : professorlist) {
            if (professor.getEmail().equalsIgnoreCase(email) && professor.getSenha().equals(senha)) {
                return professor;
            }
        }
        return null;
    }

}


