package org.example.listaDeLista;

public class Estado {
    private String nome;
    private Estado prox;
    private ListaCidade listaCid;

    public Estado(String nome, Estado prox, ListaCidade listaCid) {
        this.nome = nome;
        this.prox = prox;
        this.listaCid = listaCid;
    }

    public Estado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getProx() {
        return prox;
    }

    public void setProx(Estado prox) {
        this.prox = prox;
    }

    public ListaCidade getListaCid() {
        return listaCid;
    }

    public void setListaCid(ListaCidade listaCid) {
        this.listaCid = listaCid;
    }
}
