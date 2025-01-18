package br.com.fiap.musga.model;

public class Vendedor extends Funcionario{

        @Override
        public String getSaudacao() {
            return "Vendemos mais, vendemos tudo!";
        }

        public double getPercentualDeComissao(){
            return 12;
        }

}
