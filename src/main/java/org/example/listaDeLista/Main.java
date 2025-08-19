package org.example.listaDeLista;

public class Main {
    public static void main(String[] args) {
        ListaEstado l = new ListaEstado();
        ListaCidade listaCid;

        l.inserirEstado("São Paulo");
        l.inserirEstadoCidade("São Paulo", "Pres. Pudente");
        listaCid = l.buscaEstado("São Paulo").getListaCid();
        listaCid.inserirCidade("Marília");
        listaCid.inserirCidade("Assis");

        l.inserirEstadoCidade("Paraná", "Maringá");
        listaCid = l.buscaEstado("Paraná").getListaCid();
        listaCid.inserirCidade("Apucarana");
        listaCid.inserirCidade("Londrina");
        listaCid.inserirCidade("Arapongas");

        l.inserirEstadoCidade("Santa Catarina", "Joinville");
        l.buscaEstado("Santa Catarina").getListaCid().inserirCidade("Blumenal");
        //l.exibir();

        System.out.println("Ordenando Estados:");
        l.ordenarEstados();
        l.exibir();

        System.out.println("Ordenando Cidades:");
        //l.ordenarCidade(l.buscaEstado("São Paulo"));
        l.ordenarCidades();
        l.exibir();

        l.listarCidades(l.buscaEstado("São Paulo"));

        String estado = "São Paulo";
        String cidade = "Marília";
        boolean bool = l.verifica(estado, cidade);
        System.out.printf("A dupla: %s, %s. %s", estado, cidade, bool ? "Existe" : "Não Existe");
    }
}
