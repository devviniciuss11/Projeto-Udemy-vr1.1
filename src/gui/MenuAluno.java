package gui;

import Repositorio.AlunoRepositorio;
import Servico.AlunoServico;
import Servico.CursoServico;
import entidades.Aluno;

import java.util.Scanner;

public class MenuAluno {

    public void menuAluno(Aluno aluno, Scanner sc) {
        int sair = 0;
        while (sair!= 7) {
            System.out.println("----------------------MENU DOS ALUNOS----------------------------");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Seja Bem-Vindo Aluno "+aluno.getNome()+" que voce deseja fazer ? : ");
            System.out.println("[1]Comprar Curso");
            System.out.println("[2]Remover Curso Adquirido");
            System.out.println("[3]Ver Seus Cursos Adquiridos");
            System.out.println("[4]Ver Lista de Alunos Cadastrados");
            System.out.println("[5]Remover Cadastro");
            System.out.println("[6]Aluno Ver seus Dados");
            System.out.println("[7]Sair");
            int opcao = sc.nextInt();
            sc.nextLine();
            if (opcao > 7 || opcao == 0){
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

                case 4:
                    AlunoRepositorio alunoRepositorio = new AlunoRepositorio();
                    alunoRepositorio.mostrarAlunos();
                    break;

                case 5:
                    AlunoServico alunoServico1 = new AlunoServico();
                    alunoServico1.excluirAluno(sc);
                    sair = 7;
                    break;
                case 6:
                    AlunoServico alunoServico2 = new AlunoServico();
                    alunoServico2.alunoVerSeusDados(sc);
                    break;

                case 7:
                    System.out.println("Voltando Pra tela Inicial...");
                    sair = 7;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;


            }

        }

    }
}
