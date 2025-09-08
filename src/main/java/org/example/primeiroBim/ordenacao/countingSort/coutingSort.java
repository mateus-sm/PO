package org.example.primeiroBim.ordenacao.countingSort;

import java.util.Arrays;

public class coutingSort {
    public static void main(String[] args) {
        int[] vet = {2, 4, 9, 7, 5, 3, 9, 4, 1, 0, 1, 3, 2, 1, 5};

        System.out.println(Arrays.toString(counting(vet)));
    }

    public static int[] counting(int[] l) {
        //achar o maior elemento
        //criar um vetor novo com o tamanho do valor do maior elemento + 1
        //popular esse vetor com as quantidades de ocorrencias de cada indice do vetor original
        //popular esse vetor com uma soma acumulativa
        //criar outro vetor e atribuir usando formula s[c[l[i]]] = l[i];
        int m = Arrays.stream(l).max().getAsInt();
        int[] c = new int[m + 1];
        int[] s = new int[l.length];

        for(int i = 0; i < l.length; i++) {
            c[l[i]] += 1;
        }

        for (int i = 1; i <= m; i++) {
            c[i] += c[i - 1];
        }

        for (int i = 0; i < l.length; i++) {
            c[l[i]] = c[l[i]] - 1;
            s[c[l[i]]] = l[i];
        }

        return s;
    }
}
