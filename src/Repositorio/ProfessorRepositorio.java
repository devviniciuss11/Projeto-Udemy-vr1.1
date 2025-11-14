package Repositorio;
import java.util.ArrayList;
import entidades.Professor;

public class ProfessorRepositorio {

    public static ArrayList <Professor> professorlist = new ArrayList<>();

    public void salvar (Professor professor) {
        professorlist.add(professor);
    }



    public void mostrandoProfessor() {
        System.out.println("Mostrando Professor: ");
        for (int i = 0; i < professorlist.size(); i++) {
            System.out.println(
                    i + 1 + " °: " + professorlist.get(i).getNome() + "\nNome: " + professorlist.get(i).getCpf() + "\nCPF: " +
                            professorlist.get(i).getCpf() + "\nData De Nascimento: " + professorlist.get(i).getDataNascimento());
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


