package org.example.primeiroBim.lista.listaGen;

public class Caixa extends No {
    private No cabeca;
    private Caixa cauda;

    public Caixa() {}

    public Caixa(No cabeca, Caixa cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public No getCabeca() {
        return cabeca;
    }

    public void setCabeca(No cabeca) {
        this.cabeca = cabeca;
    }

    public Caixa getCauda() {
        return cauda;
    }

    public void setCauda(Caixa cauda) {
        this.cauda = cauda;
    }
}
