package org.example.primeiroBim.lista.listaDeLista;

public class ListaEstado {
    private Estado inicio;

    public ListaEstado(Estado inicio) {
        this.inicio = inicio;
    }

    public ListaEstado() {
        this.inicio = null;
    }

    public void inicializar() {
        inicio = null;
    }

    public Estado getInicio() {
        return inicio;
    }

    public void setInicio(Estado inicio) {
        this.inicio = inicio;
    }

    public void inserirEstado(String info) {
        Estado est = new Estado(info, null, null);
        Estado aux = inicio, ant = aux;
        boolean bool = true;

        if (aux == null) {
            inicio = est;
        } else {
            while (aux != null) {
                if (aux.getNome().equals(info)) {
                    bool = false;
                }
                ant = aux;
                aux = aux.getProx();
            }

            if (bool) {
                ant.setProx(est);
            }
        }
    }

    public void exibir() {
        Estado aux = this.inicio;
        Cidade sub;

        while (aux != null) {
            System.out.println(aux.getNome());

            if (aux.getListaCid() != null) {
                sub = aux.getListaCid().getInicio();
                if (sub != null) {
                    System.out.print("\t* ");
                    while (sub.getProx() != null) {
                        System.out.printf("%s -> ", sub.getNome());
                        sub = sub.getProx();
                    }
                    System.out.println(sub.getNome());
                }
            }

            aux = aux.getProx();
        }
        System.out.println();
    }

    //Seu algoritmo deverá ser capaz de resolver as seguintes operações:
    // a. Inserir os pares Estado,Cidade ao final das listas (tipo Fila)!;
    public void inserirEstadoCidade(String estado, String cidade) {
        inserirEstado(estado);
        Estado est = buscaEstado(estado);

        ListaCidade listaCid;
        if (est.getListaCid() == null) {
            listaCid = new ListaCidade(null);
            listaCid.inserirCidade(cidade);
            est.setListaCid(listaCid);
        } else {
            est.getListaCid().inserirCidade(cidade);
        }
    }

    //Ordenar as Listas de Estado e as listas de Cidades;
    public void ordenarEstados() {
        Estado at;
        Estado ant;
        String str;
        ListaCidade aux;
        boolean flag = true;

        while (flag) {
            at = this.inicio;
            flag = false;
            while (at.getProx() != null) {
                ant = at;
                at = at.getProx();

                if (at.getNome().compareToIgnoreCase(ant.getNome()) < 0) {
                    str = at.getNome();
                    aux = at.getListaCid();

                    at.setNome(ant.getNome());
                    at.setListaCid(ant.getListaCid());

                    ant.setNome(str);
                    ant.setListaCid(aux);

                    flag = true;
                }
            }
        }
    }

    public void ordenarCidades() {
        Estado aux = inicio;
        ListaCidade lista;

        while (aux != null) {
            lista = aux.getListaCid();
            if (lista != null) {
                lista.ordenarCidade();
            }
            aux = aux.getProx();
        }
    }

    //Buscar um Estado retornando o endereço do nodo, ou null caso não
    //encontre;
    public Estado buscaEstado(String nome) {
        Estado aux = this.inicio;

        while (aux != null && !aux.getNome().equals(nome)) {
            aux = aux.getProx();
        }

        return aux;
    }

    //Listar todas as Cidades de um determinado Estado;
    public void listarCidades(Estado no) {
        Cidade cid = no.getListaCid().getInicio();

        System.out.println("Cidades em " + no.getNome());
        if (cid != null) {
            System.out.print("\t* ");
            while (cid.getProx() != null) {
                System.out.printf("%s -> ", cid.getNome());
                cid = cid.getProx();
            }
            System.out.println(cid.getNome());
        }
    }

    //Verificar se um par Estado,Cidade está inserido nas Listas, retornando
    //  um boolean (True/False).
    public boolean verifica(String est, String cidade) {
        Estado aux = buscaEstado(est);
        ListaCidade listaCid;
        if (aux != null) {
            listaCid = aux.getListaCid();
            return listaCid.buscaCidade(cidade) != null;
        }
        return false;
    }

}
