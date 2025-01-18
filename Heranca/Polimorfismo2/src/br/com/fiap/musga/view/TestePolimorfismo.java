package br.com.fiap.musga.view;

import br.com.fiap.musga.model.Funcionario;
import br.com.fiap.musga.model.Vendedor;

public class TestePolimorfismo {

         public static void main(String[] args) {
             Funcionario funcionario = new Funcionario();
             System.out.println(funcionario.getSaudacao()); //Executa o método do funcionario

             Vendedor vendedor = new Vendedor();
             System.out.println(vendedor.getSaudacao()); //Executa o método do vendedor

             Funcionario teste = new Vendedor();
             System.out.println(teste.getSaudacao());        //Executa qual método?
             System.out.println(((Vendedor) teste).getPercentualDeComissao());    //cast, conversão do valor de um tipo para outro




         }

}
