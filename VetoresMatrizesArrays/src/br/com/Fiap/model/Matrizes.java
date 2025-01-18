package br.com.Fiap.model;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        int[][] matriz = new int[3][2];    //matriz de 3 linhas e 2 colunas

        int[][] matrizDireta = {{1, 2}, {3, 4}, {5, 6}};    //3 linhas e 2 colunas com valores especificos

        int elemento = matrizDireta[0][1];   //acessa o elemento da primeira linha e segunda coluna

        matrizDireta[0][1] = 10;      //modifica o elemento na primeira e segunda coluna para 10

        for (int i = 0; i < matriz.length; i++) {  //percorre linahs
            for (int j = 0; j < matrizDireta[i].length; j++) {  //percorre colunas
                System.out.println(matrizDireta[i][j]);
            }
        }


        Scanner sc = new Scanner(System.in);

        //matriz representando os assentos do cinema 0=livre e 1=ocupado
        int[][] salaCinema = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0}
        };

        //exibe a situação atual dos assentos
        System.out.println("Situação atual dos assentos (L = livre, O = ocupado): ");
        for (int i = 0; i < salaCinema.length; i++){
            for (int j = 0; j < salaCinema[i].length; j++){
                System.out.println(salaCinema[i][j] == 0 ? "L" : "O");
            }
            System.out.println(" <- Fila " + (i+1));
        }

        // recebe resposta do usuario
        System.out.println("Escolha a fila: ");
        int filaEscolhida = sc.nextInt() - 1;  //ajusta para o índice do vetor (base 0), serve para ajustar o range na hora de inserir o numero da coluna ou linha

        System.out.println("Escolha o número do assento: ");
        int assentoEscolhido = sc.nextInt() - 1;    //ajusta para o índice de vetor base 0

        //verifica e atualiza a reserva do assento
        if (filaEscolhida >= 0 && filaEscolhida < salaCinema.length && assentoEscolhido >= 0 && assentoEscolhido < salaCinema[filaEscolhida].length){
            if (salaCinema[filaEscolhida][assentoEscolhido] == 0){

                salaCinema[filaEscolhida][assentoEscolhido] = 1;
                System.out.println("Assento reservado com sucesso!");
            } else{
                System.out.println("O assento já esta ocupado, escolha outro");
            }
        } else{
            System.out.println("Escolha errada, tente novamente");
        }


        sc.close();
    }
}
