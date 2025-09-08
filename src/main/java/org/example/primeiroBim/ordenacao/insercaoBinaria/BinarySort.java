package org.example.primeiroBim.ordenacao.insercaoBinaria;

public class BinarySort {
    public static void main(String[] args) {
        int[] vet = {2, 4, 9, 7, 5};

        insercaoBinaria(vet);
        for(int i : vet) {
            System.out.print(i + " ");
        }
    }

    public static void insercaoBinaria(int[] vet) {
        int i = 0, pos, aux;

        while (i < vet.length - 1) {
            i++;
            aux = vet[i];
            pos = buscaBinaria(vet, i);

            while (i > pos) {
                vet[i] = vet[i - 1];
                i--;
            }

            vet[pos] = aux;
        }
    }

    public static int buscaBinaria(int[] vet, int TL) {
        int meio, inicio = 0, fim = TL - 1, aux = vet[TL];
        meio = (inicio + fim) / 2;

        while (inicio < fim) {
            if (vet[meio] > aux) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

            meio = (inicio + fim) / 2;
        }

        if (vet[TL] > vet[TL - 1]) {
            return TL;
        }
        return meio;
    }
}
