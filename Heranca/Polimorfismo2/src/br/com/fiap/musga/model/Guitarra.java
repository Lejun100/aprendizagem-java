package br.com.fiap.musga.model;

public class Guitarra extends Produto {

    public String material;

    public Guitarra(){
        super();
    }

    public Guitarra(String nome, String marca, String material) {
        super(nome, marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public Guitarra setMaterial(String material) {
        this.material = material;
        return this;
    }

    @Override
    public String getFormaEntrega(){
        return "Entregamos por correiro";
    }

    @Override
    public String toString(){         // é uma sobescrita, esse metodo cria uma string builder e concatena tudo, adicionando nome e marca
        final StringBuilder sb = new StringBuilder("Bateria{");
        sb.append("material='").append(material).append('\'');
        sb.append("nome='").append(nome).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
