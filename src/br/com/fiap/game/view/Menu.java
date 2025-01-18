package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonagemMagico personagem = new PersonagemMagico();
        int option;
        do{
            System.out.println("Escolha uma opção: \n1 - Novo personagem \n2 - Exibir personagem \n3 - Sair \n4 - Atacar \n 5 -aumentar energia \n 6 - ativar habilidade especial \n 7 - Habilitar habilidade especial");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o poder do personagem:");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nivel do personagem:");
                    int nivel = sc.nextInt();
                    personagem.setNome(nome).setNivelEnergia(nivel).setPoderMagico(poder);


                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo da habilidade especial:");
                    int custo = sc.nextInt();
                    System.out.println("A habilidade está ativada? (true/false)");
                    boolean ativada = sc.nextBoolean();

                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custo, ativada);
                    personagem.setHabilidadeEspecial(habilidadeEspecial);
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.getNome() + " Poder: " + personagem.getPoderMagico() + " Nível:" + personagem.getNivelEnergia());
                    System.out.println("Habilidade: " + personagem.getHabilidadeEspecial().getNome() + " Custo: " + personagem.getHabilidadeEspecial().getCustoEnergia() + " A habilidade está ativada: " + personagem.getHabilidadeEspecial().isHabilitada());
                    break;
                case 3:
                    System.out.println("Finalizando");
                    return;
                case 4:
                    System.out.println("Digite o nome do ataque:");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 5:
                    System.out.println("Digite a quantidade de energia:");
                    double qtd = sc.nextInt();
                    double nivelAtual = personagem.aumentarEnergia(qtd);
                    System.out.println("Nível de energia: " + nivelAtual);
                    break;
                case 6:
                    personagem.ativarHabilidadeEspecial();
                    break;
                case 7:
                    System.out.println("A habilidade está ativada.");
                    personagem.getHabilidadeEspecial().ativarHabilidade();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(option != 0);

        sc.close();
    }
}
