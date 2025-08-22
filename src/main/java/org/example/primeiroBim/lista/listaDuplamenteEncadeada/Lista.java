package org.example.primeiroBim.lista.listaDuplamenteEncadeada;

public class Lista {
    private No inicio;
    private No fim;

    public Lista() {
        this.inicio = null;
        this.fim = null;
    }

    public void inicializa() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirNoInicio(int info) {
        No no = new No(null, inicio, info);

        if (fim == null) {
            inicio = fim = no;
        } else {
            inicio.setAnt(no);
            inicio = no;
        }
    }

    public void inserirNoFinal(int info) {
        No no = new No(fim, null, info);

        if (inicio == null) {
            inicio = fim = no;
        } else {
            fim.setProx(no);
            fim = no;
        }
    }

    public void exibir() {
        No aux = inicio;

        if (aux != null) {
            while (aux.getProx() != null) {
                System.out.print(aux.getInfo() + ", ");
                aux = aux.getProx();
            }
            System.out.println(aux.getInfo());
        } else {
            System.out.println("Lista vazia!");
        }

    }

    public No buscaExaustiva(int info) {
        No aux = inicio;

        while (aux != null && info != aux.getInfo()) {
            aux = aux.getProx();
        }

        return aux;
    }

    public void remover(int info) {
        No aux = this.buscaExaustiva(info);

        if (aux != null && aux.getInfo() == info) {
            if (inicio == fim) { //Remover unico elem
                inicio = fim = null;
            } else {
                if (aux.getAnt() == null) { //Remover primeiro
                    inicio = aux.getProx();
                    inicio.setAnt(null);
                } else {
                    if (aux.getProx() == null) { //Remover ultimo
                        fim = aux.getAnt();
                        fim.setProx(null);
                    } else { //remover do meio
                        aux.getAnt().setProx(aux.getProx());
                        aux.getProx().setAnt(aux.getAnt());
                    }
                }
            }
        }
    }
}
