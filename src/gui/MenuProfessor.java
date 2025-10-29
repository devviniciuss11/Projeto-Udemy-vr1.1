package gui;

import Servico.CursoServico;
import entidades.Professor;

import java.util.Scanner;


public class MenuProfessor {
    public void menuProfessor(Professor professor, Scanner sc){
        System.out.println("----------------------MENU DOS PROFESSORES-----------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Seja Bem-Vindo Professor "+professor.getNome()+" que voce deseja fazer ? : ");
        System.out.println("[1]Adicionar Curso");
        System.out.println("[2]Remover Curso");
        System.out.println("[3]Ver Seus Cursos");
        System.out.println("[4]Sair");
       int opcao = sc.nextInt();
       sc.nextLine();
       if (opcao > 4 || opcao == 0){
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
              cursoServico3.professorVerCursos(sc);
               break;
           case 4:
               break;




       }

    }
}
