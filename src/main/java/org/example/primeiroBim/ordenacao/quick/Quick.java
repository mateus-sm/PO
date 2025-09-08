package org.example.primeiroBim.ordenacao.quick;

public class Quick {
    public static void main(String[] arg) {
        int[] vet = {2, 4, 9, 7, 5, 3, 9, 4, 1, 0};

        quickSort(vet);
        for(int i : vet) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] vet) {
        //Começando com i = ini, j = fim
        //i aumenta se vet[j] for maior do que vet[i]
        //caso vet[j] for menor é feita uma troca
        //inverte as comparações
        //j aumenta se vet[i] for menor que vet[j]
        //caso vet[i] for maior é feita uma troca
        //inverte as comparações
        particiona(vet, 0, vet.length - 1);
    }

    public static void particiona(int[] vet, int ini, int fim) {
        int i = ini, j = fim, aux;
        boolean flag = true;

        while (i < j) {
            if (flag) {
                while(i < j && vet[i] <= vet[j]) {
                    i++;
                }
            } else {
                while(i < j && vet[i] <= vet[j]) {
                    j--;
                }
            }

            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            flag = !flag;
        }

        if (ini < i - 1) {
            particiona(vet, ini, i - 1);
        }
        if (j + 1 < fim) {
            particiona(vet, j + 1, fim);
        }
    }
}
