package br.com.fiap.sistema.view;

import br.com.fiap.sistema.model.Endereco;
import br.com.fiap.sistema.model.Programador;

import java.util.Scanner;

public class ViewProgramador {

    private static void exibirMenu(){
        System.out.println("Você deve selecionar uma operação:\n1 - Cadastrar/Alterar gerente \n2 - Exibir gerente \n3 - Sair");
    }

    private static Programador cadastrarProgramador(){
        Programador programador = new Programador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do programador: ");
        programador.setNome(sc.nextLine());
        System.out.println("Informe o nome da rua, o número, o complemento, o CEP, a cidade, o estado, teclando o enter no final de cada um: ");
        programador.setEndereco(new Endereco(sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()));
        System.out.println("Informe o CPF do gerente: ");
        programador.setCpf(sc.nextLine());
        System.out.println("Informe o salário fixo do programador: ");
        programador.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o ramal do programador: ");
        programador.setRamal(sc.nextInt());
        return programador;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Programador programador = null;
        int option;
        do{
            exibirMenu();
            option = sc.nextInt();
            switch (option){
                case 1:
                    programador = cadastrarProgramador();
                    break;
                case 2:
                    if(programador != null)
                        System.out.println(programador.getDetalhamento());
                    else
                        System.out.println("Nenhum programador cadastrado");
                    break;
                case 3:
                    System.out.println("Finalizando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        }while (option != 3);
        sc.close();
    }
}
