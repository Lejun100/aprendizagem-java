package br.com.fiap.restaurante.view;

import br.com.fiap.restaurante.model.Bebida;
import br.com.fiap.restaurante.model.Produto;


public class Main {
    public static void main(String[] args) {


        Bebida bebida = new Bebida("Suco de laranja","agua,laranja",7.85, 500);
        System.out.println("Bebida");
        System.out.println("A bebida informada foi " + bebida.getNome());
        System.out.println(", é composta por " + bebida.getIngredientes());
        System.out.println(", custa R$" + bebida.getPreco());
        System.out.println(" e a sua quantidade é " + bebida.getQuantidade() + "ml");
        System.out.println(bebida.getResumo());

    }
}