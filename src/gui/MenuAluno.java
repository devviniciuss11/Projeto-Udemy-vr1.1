package gui;

import Servico.AlunoServico;
import entidades.Aluno;
import entidades.Curso;

import java.util.Scanner;

public class MenuAluno {

    public void menuAluno(Aluno aluno, Scanner sc) {
        System.out.println("----------------------MENU DOS ALUNOS----------------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Seja Bem-Vindo Aluno "+aluno.getNome()+" que voce deseja fazer ? : ");
        System.out.println("[1]Comprar Curso");
        System.out.println("[2]Remover Curso Adquirido");
        System.out.println("[3]Ver Seus Cursos Adquiridos");
        System.out.println("[4]Sair");
        int opcao = sc.nextInt();
        sc.nextLine();
        if (opcao > 4 || opcao == 0){
            System.out.println("Digite uma Opcao Valida: ");
        }
        switch(opcao){
            case 1:
                AlunoServico alunoServico = new AlunoServico();
                alunoServico.comprar(sc, aluno);
                break;

            case 2: //alunoservicos.alunoremovercursos
                break;

            case 3:
                AlunoServico alunoServico2 = new AlunoServico();
                alunoServico2.vercursosadquiridos();
                System.out.println(aluno.getCursos());

                    break;

        }
    }
}
