package org.example.listaDeLista;

public class Lista {
    private Estado inicio;

    public Lista() {
        this.inicio = null;
    }

    public void inicializar() {
        this.inicio = null;
    }

    public Estado getInicio() {
        return inicio;
    }

    public void setInicio(Estado inicio) {
        this.inicio = inicio;
    }

    public void inserirEstado(String info) {
        Estado est = new Estado(info, null, null);
        Estado aux = this.inicio;

        if (aux == null) {
            inicio = est;
        } else {
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(est);
        }
    }

    public void exibir() {
        Estado aux = this.inicio;
        Cidade sub;

        while (aux != null) {
            System.out.println(aux.getNome());

            sub = aux.getCid();
            if (sub != null) {
                System.out.print("\t* ");
                while (sub.getProx() != null) {
                    System.out.printf("%s -> ", sub.getNome());
                    sub = sub.getProx();
                }
                System.out.println(sub.getNome());
            }

            aux = aux.getProx();
        }

    }

    public void inserirCidade(String alvo, String info) {
        Estado est = this.inicio;
        Cidade cidade = new Cidade(null, null, info);
        Cidade cid;

        while (est != null && !est.getNome().equals(alvo)) {
            est = est.getProx();
        }

        if (est != null) {
            cid = est.getCid();

            if (cid != null) {
                while (cid.getProx() != null) {
                    cid = cid.getProx();
                }

                cid.setProx(cidade);
            } else {
                est.setCid(cidade);
            }

        }
    }

    //Seu algoritmo deverá ser capaz de resolver as seguintes operações:
    // a. Inserir os pares Estado,Cidade ao final das listas (tipo Fila)!;
    public void inserirEstadoCidade(String estado, String cidade) {
        inserirEstado(estado);
        inserirCidade(estado, cidade);
    }

    //Ordenar as Listas de Estado e as listas de Cidades;
    public void ordenarEstados() {
        Estado at = this.inicio;
        Estado ant;
        String str;
        Cidade aux;
        boolean flag = true;

        while (flag) {
            at = this.inicio;
            flag = false;
            while (at.getProx() != null) {
                ant = at;
                at = at.getProx();

                if (at.getNome().compareToIgnoreCase(ant.getNome()) < 0) {
                    str = at.getNome();
                    aux = at.getCid();

                    at.setNome(ant.getNome());
                    at.setCid(ant.getCid());

                    ant.setNome(str);
                    ant.setCid(aux);

                    flag = true;
                }
            }
        }
    }
}
