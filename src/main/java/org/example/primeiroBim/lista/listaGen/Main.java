package org.example.primeiroBim.lista.listaGen;

public class Main {
    public static void main(String[] args) {
        ListaGen l = new ListaGen();
        l.inicializar();

        l.setInicio(new Caixa());
        l.getInicio().setCabeca(new Caixa());
        l.getInicio().setCauda(new Caixa());

        No aux = l.head(); // E agora?
    }
}
