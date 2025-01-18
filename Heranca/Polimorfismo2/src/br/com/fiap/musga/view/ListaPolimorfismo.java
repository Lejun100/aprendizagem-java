package br.com.fiap.musga.view;

import br.com.fiap.musga.model.Bateria;
import br.com.fiap.musga.model.Guitarra;
import br.com.fiap.musga.model.Produto;

import java.util.ArrayList;

public class ListaPolimorfismo {

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();   //lista de produtos, podendo colocar baterias e guitarras, se nao apenas uma lista apenas de baterias e etc

        //sintaxe lista.add(objeto aceito pela lista)
        produtos.add(new Bateria("HD-1", "Roland", 7));
        produtos.add(new Guitarra("T-506C", "Tagima", "Mapple"));

        //looping que executa para cada objeto do tipo Produto
        //presente na lista produtos
        for (var produtoNaLista : produtos){
            System.out.println("O produto:"
            + produtoNaLista + "tem a forma de entrega: "
            + produtoNaLista.getFormaEntrega());
        }
    }
}
