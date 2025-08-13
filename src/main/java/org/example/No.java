package org.example;

public class No {
    private No ant;
    private No prox;
    private int info;

    No(No ant, No prox, int info) {
        this.ant = ant;
        this.prox = prox;
        this.info = info;
    }

    No() {
        this.ant = null;
        this.prox = null;
        this.info = -1;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
