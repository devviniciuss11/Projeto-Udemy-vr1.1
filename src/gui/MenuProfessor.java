package gui;

import Repositorio.ProfessorRepositorio;
import Servico.CursoServico;
import Servico.ProfessorServico;
import entidades.Professor;

import java.util.Scanner;


public class MenuProfessor {
    public void menuProfessor(Professor professor, Scanner sc){
        int sair = 0;
        while(sair!= 7){
            System.out.println("----------------------MENU DOS PROFESSORES-----------------------");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Seja Bem-Vindo Professor "+professor.getNome()+" que voce deseja fazer ? : ");
            System.out.println("[1]Adicionar Curso");
            System.out.println("[2]Remover Curso");
            System.out.println("[3]Ver Seus Cursos");
            System.out.println("[4]Ver Seus Dados");
            System.out.println("[5]Remover Professor");
            System.out.println("[6]Mostrar Todos os Professores");
            System.out.println("[7]Sair");
            int opcao = sc.nextInt();
            sc.nextLine();
            if (opcao > 7 || opcao == 0){
                System.out.println("Digite uma Opcao Valida: ");
            }
            switch(opcao){

                case 1:
                    CursoServico cursoServico = new CursoServico();
                    cursoServico.professorAdicionarCurso(sc);
                    break;
                case 2:
                    CursoServico cursoServico2 = new CursoServico();
                    cursoServico2.professorRemoverCursos(sc);
                    break;
                case 3:
                    CursoServico cursoServico3 = new CursoServico();
                    cursoServico3.professorVerCursos();
                    break;
                case 4:
                    ProfessorServico professorServico = new ProfessorServico();
                    professorServico.professorVerSeusDados(sc);
                    break;

                case 5:
                    ProfessorServico professorServico2 = new ProfessorServico();
                    professorServico2.excluirProfessor();
                    break;


                case 6:
                    ProfessorRepositorio professorRepositorio2 = new ProfessorRepositorio();
                    professorRepositorio2.mostrandoProfessor();
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
