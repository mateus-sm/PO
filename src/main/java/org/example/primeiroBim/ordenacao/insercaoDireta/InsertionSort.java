package org.example.primeiroBim.ordenacao.insercaoDireta;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vet = {2, 4, 9, 7 , 5};

        insercaoDireta(vet);
        for(int i : vet) {
            System.out.print(i + " ");
        }
    }

    public static void insercaoDireta(int[] vet) {
        //Começando do indice 1 vem remanejando os elementos a esquerda
        // até achar lugar pro elemento do indice 1
        int i = 0, pos = 0, aux;

        while (i < vet.length - 1) {
            i++;
            pos = i;
            aux = vet[i];

            while (pos > 0 && aux < vet[pos - 1]) {
                vet[pos] = vet[pos - 1];
                pos--;
            }

            vet[pos] = aux;
        }
    }
}


