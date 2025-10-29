package testes;
import entidades.MetodoDePagamento;
import java.util.Scanner;

public class testeMetodoDePagamento {
    String sistemasDeInformacao_EAD="230R$";
    String CienciasDaComputacao_EAD="780R$";
    String Farmacia_EAD="400R$";
    String nuticao_EAD="385R$";
    public static void main(String[]args){
        MetodoDePagamento m0 = new MetodoDePagamento("Boleto");
        MetodoDePagamento m1 = new MetodoDePagamento("Pix","230R$");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Metodo De Pagamento = "+m0.getTipoDoPagamento());

            System.out.println("Metodo De Pagamento ="+m1.getTipoDoPagamento() +
                   " e Valor Do Pagamento = "+m1.getValorDoPagamento());
        String metodoDePagamento = scanner.nextLine();



    }
}
