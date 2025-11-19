package entidades;

public class MetodoDePagamento {
    private String tipoDoPagamento;
    private String valorDoPagamento;

    public MetodoDePagamento(String tipoDoPagamento){
        this.tipoDoPagamento = tipoDoPagamento;
    }
    public MetodoDePagamento(String tipoDoPagamento, String valor_do_pagamneto){
        this.tipoDoPagamento = tipoDoPagamento;
        this.valorDoPagamento = valor_do_pagamneto;
    }

    public String getTipoDoPagamento(){
        return tipoDoPagamento;
    }
    public void setTipoDoPagamento(String tipoDoPagamento){
        this.tipoDoPagamento = tipoDoPagamento;
    }
    public String getValorDoPagamento(){
        return valorDoPagamento;
    }
    public void setValorDoPagamento(String valorDoPagameneto){
        this.valorDoPagamento = valorDoPagamento;
    }
}
