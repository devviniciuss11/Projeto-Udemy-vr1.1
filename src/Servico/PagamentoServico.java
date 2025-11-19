package Servico;

import java.util.Scanner;



public class PagamentoServico {
    private Scanner inputpagamento = new Scanner(System.in);


    public  boolean metodoDePagamento(String valorDoCurso){
        String valorCursoNumericoStr = valorDoCurso.replaceAll("[^0-9,]", "").replace(",", ".");
        double valorCursoDouble = Double.parseDouble(valorCursoNumericoStr);

        System.out.println("O valor do curso é: R$" + String.format("%.2f", valorCursoDouble));
        System.out.println("Digite o valor do Pagamento: ");
        double valorPagamento = inputpagamento.nextDouble();
        inputpagamento.nextLine();

        if (valorPagamento != valorCursoDouble) {
            System.out.println("Valor incorreto. Digite o mesmo valor do curso para prosseguir.");
            return false;
        }

        System.out.println("Escolha o metodo de pagamento:");
        System.out.println("[1] Pix");
        System.out.println("[2] Debito");
        System.out.println("[3] Credito");
        System.out.println("[4] Cheque");
        System.out.println("[5] Boleto");

        int opcao = inputpagamento.nextInt();
        inputpagamento.nextLine();
        switch (opcao){
            case 1 :
                adicionando_pix();
                return true;

            case 2 :
                adicionando_debito();
                return true;

            case 3 :
                adcionando_credito();
                return true;

            case 4 :
                adicionando_cheque();
                return true;

            case 5 :
                adicionando_boleto();
                return true;

            case 6 :
                return false;
            default: return false;
        }
    }


    private void adcionando_credito() {


        System.out.println("O pagamento utilizando credito foi efetuado com sucesso!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private void adicionando_debito() {



        System.out.println("O pagamento ultilizando debito foi efetuado com sucesso!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionando_pix() {


        System.out.println("O pagamento utilizando pix foi efetuado com sucesso!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void adicionando_boleto() {

        System.out.println("O pagamento utilizando boleto foi efetuado com sucesso!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void adicionando_cheque() {

        System.out.println("O pagamento utilizando cheque foi efetuado com sucesso!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

