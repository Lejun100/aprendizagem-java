package br.com.fiap.restaurante.model;

public class Bebida extends Produto {

    private int quantidade;

    public Bebida(){
        super();
    }

    @Override
    public String getResumo() {
        return "Nome:" + this.getNome() + "\nIngredientes: " + this.getIngredientes() + "\nPreço: " + this.getPreco();
    }

    public Bebida(String nome, String ingredientes, double preco, int quantidade) {
        super(nome, ingredientes, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
