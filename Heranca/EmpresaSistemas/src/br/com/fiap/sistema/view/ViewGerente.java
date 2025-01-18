package br.com.fiap.sistema.view;

import br.com.fiap.sistema.model.Endereco;
import br.com.fiap.sistema.model.Gerente;

import java.util.Scanner;

public class ViewGerente {

    private static void exibirMenu(){
        System.out.println("Você deve selecionar uma operação:\n1 - Cadastrar/Alterar gerente \n2 - Exibir gerente \n3 - Sair ");
    }

    private static Gerente cadastrarGerente(){
        Gerente gerente = new Gerente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do gerente: ");
        gerente.setNome(sc.nextLine());
        System.out.println("Informe o nome da rua, o número, o complemento, o CEP, a cidade, o estado, teclando o enter no final de cada um: ");
        gerente.setEndereco(new Endereco(sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()));
        System.out.println("Informe o CPF do gerente: ");
        gerente.setCpf(sc.nextLine());
        System.out.println("Informe o salário fixo do gerente: ");
        gerente.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o número da sala do gerente: ");
        gerente.setSala(sc.nextInt());
        System.out.println("Informe o ramal do gerente: ");
        gerente.setRamal(sc.nextInt());
        System.out.println("Informe o faturamento semestral do gerente: ");
        gerente.setFaturamentoSemestral(sc.nextDouble());
        return gerente;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Gerente gerente = null;
        int op;
        do{
            exibirMenu();
            op = sc.nextInt();
            switch (op){
                case 1:
                    gerente = cadastrarGerente();
                    break;
                case 2:
                    if(gerente != null)
                        System.out.println(gerente.getDetalhamento());
                    else
                        System.out.println("Nenhum gerente cadastrado");
                    break;
                case 3:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (op != 3);
        sc.close();
    }
}
