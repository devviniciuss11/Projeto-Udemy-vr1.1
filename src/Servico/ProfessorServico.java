package Servico;

import java.util.Scanner;
import interfacess.Teste;
import Repositorio.ProfessorRepositorio;
import entidades.Professor;
import gui.MenuProfessor;

import static Repositorio.ProfessorRepositorio.professorlist;

public class ProfessorServico {
    ProfessorRepositorio repositorioprofessor = new ProfessorRepositorio();
    Teste teste01 = new Teste();
    MenuProfessor menuProfessor = new MenuProfessor();
    Scanner InputDoProfessor = new Scanner(System.in);
    public void cadastrar(Scanner sc) {
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do professor: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o email do professor: ");
        String email = sc.nextLine();

        System.out.println("Digite o senha do professor: ");
        String senha = sc.nextLine();
        System.out.println("Digite a mesma senha novamente");
        String senha2 = sc.nextLine();

        while (!senha.equals(senha2)) {

            System.out.println("Senha Diferente");
            System.out.println("Digite o senha do professor: ");
            senha = sc.nextLine();
            System.out.println("Digite a mesma senha novamente");
            senha2 = sc.nextLine();

        }
        System.out.println("Digite a Sua Data de Nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.println("Digite Suas Qualificaçoes");
        String qualificacao = sc.nextLine();


            Professor professor = new Professor(nome, cpf, dataNascimento, email, senha, qualificacao);
            repositorioprofessor.salvar(professor);
            professor.email();
            professor.senha();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        teste01.adicionando01();
            menuProfessor.menuProfessor(professor, sc);


    }

    public void login(Scanner sc){
        System.out.println("Digite o email do professor: ");
        String email = sc.nextLine();
        System.out.println("Digite o senha do professor: ");
        String senha = sc.nextLine();
        Professor professor = repositorioprofessor.loginProfessor(email,senha);
        if(professor != null){
            menuProfessor.menuProfessor(professor,sc);
        }else{
            System.out.println("Email ou Senha Incorretas");
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

    public void professorVerSeusDados(Scanner sc){
        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.println("Digite o email do professor: ");
        String email = sc.nextLine();
        Professor professor1 = new Professor(nome, email);
        System.out.println("----SEUS DADOS----");
        System.out.println("SEU NOME "+professor1.getNome());
        System.out.println("SEU EMAIL "+professor1.getEmail());
    }



}

