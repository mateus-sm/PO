package org.example.primeiroBim.lista.listaDeLista;

public class ListaCidade {
    private Cidade inicio;

    public ListaCidade(Cidade inicio) {
        this.inicio = inicio;
    }

    public ListaCidade() {
    }

    public void inicializar() {
        inicio = null;
    }

    public Cidade getInicio() {
        return inicio;
    }

    public void setInicio(Cidade inicio) {
        this.inicio = inicio;
    }

    public void inserirCidade(String info) {
        Cidade cid = inicio;
        Cidade cidade = new Cidade(null, info);

        if (inicio == null) {
            inicio = cidade;
        } else {
            while (cid.getProx() != null) {
                cid = cid.getProx();
            }

            cid.setProx(cidade);
        }
    }

    public Cidade buscaCidade(String cidade) {
        Cidade cid = inicio;

        while (cid != null && !cid.getNome().equals(cidade)) {
            cid = cid.getProx();
        }

        return cid;
    }

    public void ordenarCidade() {
        Cidade cid = inicio;
        Cidade at, ant;
        String str;
        boolean flag = true;

        while(flag) {
            at = cid;
            flag = false;

            while (at.getProx() != null) {
                ant = at;
                at = at.getProx();

                if(at.getNome().compareToIgnoreCase(ant.getNome()) < 0) {
                    str = at.getNome();
                    at.setNome(ant.getNome());
                    ant.setNome(str);
                    flag = true;
                }
            }
        }
    }
}
