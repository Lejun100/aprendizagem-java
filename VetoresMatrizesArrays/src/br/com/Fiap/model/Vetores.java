package br.com.Fiap.model;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        //int[] meuVetor = new int[10];

        int[] meuVetor = {10, 20, 30, 40, 50};   //declaramos o vetor do tipo int com 5 valores

        meuVetor[2] = 35;  //para modificar o valor dentro do vetor
        int elemento = meuVetor[2];    //ele vai retornar o valor presente no índice 2,
        System.out.println(meuVetor[2]);

        System.out.println(meuVetor.length);   //vai retornar o tamanho

//        for (int i = 0; i < meuVetor.length; i++){
//            System.out.println(meuVetor[i]);
//        }

        int[] vetor = new int[5];
        System.out.println("Valores dos vetores");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição [" + i + "] do vetor");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.println("[" + i + "] = " + vetor[i]);
        }

        String[] nomes = new String[50];
        double[] valores = new double[10];

    }

}
