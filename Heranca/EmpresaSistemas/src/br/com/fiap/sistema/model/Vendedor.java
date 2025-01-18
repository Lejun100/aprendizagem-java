package br.com.fiap.sistema.model;

public class Vendedor extends Funcionario {

    public double vendasSemestrais;

    public Vendedor(){
        super();
    }

    public Vendedor(String nome, String cpf, Endereco endereco, double salarioFixo, double vendasSemestrais) {
        super(nome, cpf, endereco, salarioFixo);
        this.vendasSemestrais = vendasSemestrais;
    }

    public double getVendasSemestrais() {
        return vendasSemestrais;
    }

    public void setVendasSemestrais(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
    }


    public double getBonus(){
        return this.getSalarioFixo() * 0.015;
    }

    @Override
    public String getDetalhamento(){
        return "Nome: " + this.getNome()
                + "\nEndereço: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario mensal: R$" + this.getSalarioFixo()
                + "\nVendas do semestre: " + this.getVendasSemestrais()
                + "\nBônus semestral: " + this.getBonus();
    }
}
