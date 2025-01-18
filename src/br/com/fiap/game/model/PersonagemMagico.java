package br.com.fiap.game.model;

public class PersonagemMagico {

    private String nome;

    private double nivelEnergia;

    private String poderMagico;

    private HabilidadeEspecial habilidadeEspecial;   //novo atributo


    public PersonagemMagico(String nome, double nivel, String poder){
        //this referencia o atributo e o outro referencia o parametro, por boas praticas bom usar o this.
        this.nome = nome;
        nivelEnergia = nivel;
        poderMagico = poder;

    }

    public PersonagemMagico(String nome){
        this.nome = nome;
    }

    public PersonagemMagico(){}

    public void atacar(String ataque){
        if (nivelEnergia >= 10){
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        }else{
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    public double aumentarEnergia(double energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if (!habilidadeEspecial.isHabilitada()){
            System.out.println("Habilidade especial não está ativada.");
        }
        else if (nivelEnergia >= habilidadeEspecial.getCustoEnergia()){
            System.out.println("Ativando a habilidade: " + habilidadeEspecial.getNome());
            nivelEnergia -= habilidadeEspecial.getCustoEnergia();
        }
        else{
            System.out.println(nome + " está sem energia para habilidade especial");
        }
    }

    public String getNome() {
        return nome;
    }

    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this; //representa o proprio objeto
    }

    public double getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(double nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public PersonagemMagico setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
        return this;
    }
}
