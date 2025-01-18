package br.com.fiap.loja.model;

public class Cliente {
    protected String nome;     //o protected da pra ser usado em pastas ou diretorios em locais separados

    protected String cpf;

    protected boolean ativo;

    public void exibirDados(){
        System.out.println(nome + " " + cpf + " " + formatarDado());
    }

    private String formatarDado(){
        if (ativo)
            return "Ativo";
        else return "Inativo";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
