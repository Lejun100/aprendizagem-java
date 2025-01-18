package br.com.fiap.musga.model;

public abstract class Produto {

    public String nome;

    public String marca;

    public Produto(){}

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFormaEntrega(){
        return "Entregamos esse produto";
    }

    @Override
    public String toString(){         // é uma sobescrita, esse metodo cria uma string builder e concatena tudo, adicionando nome e marca
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
