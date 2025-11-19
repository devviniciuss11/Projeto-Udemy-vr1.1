package Repositorio;

import java.util.ArrayList;
import entidades.MetodoDePagamento;


public class PagamentoRepositorio {


    ArrayList<MetodoDePagamento> creditolist  = new ArrayList<>();
    ArrayList<MetodoDePagamento> debitolist = new ArrayList<>();
    ArrayList<MetodoDePagamento> pixlist = new ArrayList<>();
    ArrayList<MetodoDePagamento> especielist = new ArrayList<>();
    ArrayList<MetodoDePagamento> chequelist = new ArrayList<>();


    public void salvarCredito(MetodoDePagamento pagamentocredito) {
        creditolist.add(pagamentocredito);
    }

    public void salvarDebito(MetodoDePagamento pagamentodebito) {
        debitolist.add(pagamentodebito);
    }

    public void salvarPix(MetodoDePagamento pagamentopix) {
        pixlist.add(pagamentopix);
    }

    public void salvarEspecie(MetodoDePagamento pagamentoespecie) {
        especielist.add(pagamentoespecie);
    }

    public void salvarCheque(MetodoDePagamento pagamentocheque) {
        chequelist.add(pagamentocheque);
    }

    public void mostrandoCredito() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (credito): ");
        for (int i = 0; i < creditolist.size(); i++) {
            System.out.println(i + 1 + "º: " + creditolist.get(i).getTipoDoPagamento() + "\nR$:"
                    + creditolist.get(i).getValorDoPagamento());
        }
    }

    public void mostrando_debito(){
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (debito)");
        for (int i = 0; i< debitolist.size(); i++){
            System.out.println(i + 1 + "º: " + debitolist.get(i).getTipoDoPagamento() + "\nR$:"
                    + debitolist.get(i).getValorDoPagamento());
        }
    }

    public void mostrandoPix() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (pix)");
        for (int i = 0; i < pixlist.size(); i++) {
            System.out.println(i + 1 + "º: " + pixlist.get(i).getTipoDoPagamento() + "\nR$:"
                    + pixlist.get(i).getValorDoPagamento());
        }
    }

    public void mostrandoEspecie() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (espécie)");
        for (int i = 0; i < especielist.size(); i++) {
            System.out.println(i + 1 + "º: " + especielist.get(i).getTipoDoPagamento() + "\nR$:"
                    + especielist.get(i).getValorDoPagamento());
        }
    }

    public void mostrandoCheque() {
        System.out.println("MOSTRANDO TIPO DE PAGAMENTO (cheque)");
        for (int i = 0; i < chequelist.size(); i++) {
            System.out.println(i + 1 + "º: " + chequelist.get(i).getTipoDoPagamento() + "\nR$:"
                    + chequelist.get(i).getValorDoPagamento());
        }
    }
}