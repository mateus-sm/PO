package org.example;

import org.example.listaDuplamenteEncadeada.Lista;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.inserirNoInicio(1);
        l.inserirNoFinal(2);
        //l.inserirNoFinal(3);
        l.inserirNoFinal(4);
        l.inserirNoFinal(5);
        l.exibir();

        int elem = 1;
        System.out.printf("Elemento %d %s\n", elem, l.buscaExaustiva(elem) != null ? "Encontrado!" : "Não encontrado");

        l.remover(elem);
        System.out.println("Removendo " + elem);
        l.exibir();

        elem = 4;
        l.remover(elem);
        System.out.println("Removendo " + elem);
        l.exibir();

        elem = 5;
        l.remover(elem);
        System.out.println("Removendo " + elem);
        l.exibir();

        elem = 2;
        l.remover(elem);
        System.out.println("Removendo " + elem);
        l.exibir();
    }
}