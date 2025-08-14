package org.example.listaDeLista;

public class Estado {
    private String nome;
    private Estado prox;
    private Cidade cid;

    public Estado(String nome, Estado prox, Cidade cid) {
        this.nome = nome;
        this.prox = prox;
        this.cid = cid;
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

    public Cidade getCid() {
        return cid;
    }

    public void setCid(Cidade cid) {
        this.cid = cid;
    }
}
