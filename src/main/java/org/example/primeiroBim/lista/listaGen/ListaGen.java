package org.example.primeiroBim.lista.listaGen;

public class ListaGen {
    private Caixa inicio;

    public ListaGen() {}

    public ListaGen(Caixa inicio) {
        this.inicio = inicio;
    }

    public void inicializar() {
        inicio = null;
    }

    public Caixa getInicio() {
        return inicio;
    }

    public void setInicio(Caixa inicio) {
        this.inicio = inicio;
    }

    public Caixa tail() {
        return inicio.getCauda();
    }

    public No head() {
        return inicio.getCabeca();
    }
}
