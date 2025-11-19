package Servico;

import java.util.Scanner;

public class ProjetoNodeCursos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int repeticao = 1;
            while (repeticao < 2 ){
               try  {
                   System.out.println("-----------------------------------\nSEJA BEM VINDO(A) AO NODE CURSOS\n-----------------------------------");
                   System.out.println("[1] SOBRE NODECURSOS\n[2] CADASTRO DO AlUNO \n[3] VENHA DAR AULA CONOSCO\n[4] CURSOS\n[6] EXCLUIR");
                   int entrada = sc.nextInt();
                   sc.nextLine();
                    if (entrada >6 || entrada == 0) {
                        System.out.println("Digite uma opção válida");
                        Thread.sleep(3000);
                    }

                    switch (entrada){
                        case 1:
                        NodeCursosApresentacao exemplo = new NodeCursosApresentacao();
                        exemplo.ver_NodeCursos(sc);
                        break;

                        case 2:
                            SubMenu subMenu = new SubMenu();
                            subMenu.menuDeCadastroDeAluno(sc);
                        break;

                        case 3:
                        SubMenu subMenu1 = new SubMenu();
                        subMenu1.menuDeCadastroDeProfessor(sc);
                        break;

                        case 4:
                        SubMenu subMenu2 = new SubMenu();
                        subMenu2.menuDeCursosOferecidos(sc);

                        case 6:
                            System.out.println("Saindo...");
                            Thread.sleep(3000);
                            repeticao = 2;
                            break;
                        }

                    }
                    catch (Exception e){
                        System.out.println("Erro tente novamente");
                    }
                }

        }

}