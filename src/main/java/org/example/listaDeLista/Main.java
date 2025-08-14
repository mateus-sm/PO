package org.example.listaDeLista;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.inserirEstado("Santa Catarina");
        l.inserirEstado("Paraná");
        l.inserirEstado("São Paulo");
        l.inserirCidade("São Paulo", "Pres. Pudente");
        l.inserirCidade("São Paulo", "Marília");
        l.inserirCidade("São Paulo", "Assis");
        l.inserirCidade("Santa Catarina", "Joinville");
        l.inserirCidade("Santa Catarina", "Blumenal");
        l.inserirCidade("Paraná", "Maringá");
        l.inserirCidade("Paraná", "Apucarana");
        l.inserirCidade("Paraná", "Londrina");
        l.inserirCidade("Paraná", "Arapongas");
        //l.inserirEstadoCidade("Teste", "teste");
        //l.exibir();

        l.ordenarEstados();
        l.exibir();

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
