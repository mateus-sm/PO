package org.example.primeiroBim.ordenacao.selecaoDireta;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vet = {2, 4, 9, 7, 5};

        selecaoDireta(vet);
        for(int i : vet) {
            System.out.print(i + " ");
        }
    }

    public static void selecaoDireta(int[] vet) {
        //Acha o menor e coloca ele na primeira posição
        //  aumenta o indice da primeira posição
        int menor, pos, aux, temp;

        for(int i = 0; i < vet.length; i++) {
            pos = i;
            aux = pos;
            menor = vet[pos];

            while (pos < vet.length) {
                if (vet[pos] < menor) {
                    menor = vet[pos];
                    aux = pos;
                }
                pos++;
            }

            temp = vet[i];
            vet[i] = menor;
            vet[aux] = temp;
        }
    }
}
