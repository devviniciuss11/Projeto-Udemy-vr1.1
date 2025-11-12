package gui;

import Servico.AlunoServico;
import Servico.CursoServico;
import entidades.Aluno;

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
        if (opcao > 3 || opcao == 0){
            System.out.println("Digite uma Opcao Valida: ");
        }
        switch(opcao){
            case 1:
                AlunoServico alunoServico = new AlunoServico();
                alunoServico.comprarCurso(sc, aluno);
                break;

            case 2:
                AlunoServico alunoServicoRemover = new AlunoServico();
                alunoServicoRemover.removerCursoAdquirido(sc, aluno);
                break;

            case 3:
                CursoServico cursoServico = new CursoServico();
                cursoServico.alunoVerCursos(aluno);
                break;


        }
    }
}
