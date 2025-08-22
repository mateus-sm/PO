package org.example.primeiroBim.lista.listaDeLista;

public class Cidade {
    private Cidade prox;
    private String nome;

    public Cidade(Cidade prox, String nome) {
        this.prox = prox;
        this.nome = nome;
    }

    public Cidade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getProx() {
        return prox;
    }

    public void setProx(Cidade prox) {
        this.prox = prox;
    }

}
