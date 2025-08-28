package org.example.primeiroBim.lista.listaDeLista;

public class Main {
    public static void main(String[] args) {
        ListaEstado l = new ListaEstado();

        l.inserirEstado("São Paulo");
        l.inserirEstadoCidade("São Paulo", "Pres. Pudente");
        l.inserirEstadoCidade("São Paulo", "Marília");
        l.inserirEstadoCidade("São Paulo", "Pres. Assis");

        l.inserirEstadoCidade("Paraná", "Maringá");
        l.inserirEstadoCidade("Paraná", "Apucarana");
        l.inserirEstadoCidade("Paraná", "Londrina");
        l.inserirEstadoCidade("Paraná", "Arapongas");

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
