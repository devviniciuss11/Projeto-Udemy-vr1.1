package Servico;

import java.util.Scanner;

public class SubMenu {
    AlunoServico alunoServico = new AlunoServico();
    ProfessorServico professorServico = new ProfessorServico();

    public void menuDeCadastroDeAluno(Scanner sc) {
        System.out.println("[1] - Login");
        System.out.println("[2] - Cadastro de Aluno");
        System.out.println("[0] - Voltar");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                alunoServico.login(sc);
                break;
            case 2:
                alunoServico.cadastrar(sc);
                break;
            case 0:
                System.out.println("voltando...");
                break;

        }
    }

    public void menuDeCadastroDeProfessor(Scanner sc){
        System.out.println("[1] - Login");
        System.out.println("[2] - Cadastro de Professor");
        System.out.println("[3] - Voltar");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {

            case 1:
                professorServico.login(sc);
                break;

            case 2:
                professorServico.cadastrar(sc);
                break;

                case 3:
                System.out.println("voltando...");
                break;

        }
    }

    public void menuDeCursosOferecidos(Scanner sc){
        System.out.println("Voce so pode entrar se tiver uma conta aluno!!!");
        System.out.println("[1] - Login");
        System.out.println("[2] - Cadastro de Alunos");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1:
                alunoServico.login(sc);
                break;
            case 2:
                alunoServico.cadastrar(sc);
                break;
        }


    }



        }
