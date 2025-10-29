package Servico;

import java.util.Scanner;

import entidades.Curso;
import interfacess.Teste;
import Repositorio.ProfessorRepositorio;
import entidades.Professor;
import gui.MenuProfessor;

public class ProfessorServico {
    ProfessorRepositorio repositorioprofessor = new ProfessorRepositorio();
    Teste teste01 = new Teste();
    MenuProfessor menuProfessor = new MenuProfessor();

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
            menuProfessor.menuProfessor(professor, sc);
            teste01.adicionando01();

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





}

