package br.com.Fiap.model;

public class BubbleSort {

    public static void main(String[] args) {
        int [] vetor = {54, 34, 25, 12, 22, 11, 90};

        boolean houveTroca;    //uma vartiavel de controle onde ira percorrer toda vez
            do {
                houveTroca = false;
                for (int i = 1; i < vetor.length; i++){
                    //compara elementos adjacentes
                    if (vetor[i-1] > vetor[i]){     // se o vetor de i - 1 é zero, se esse valor a esquerda é maior que o da direita, se sim ocorrerá troca
                        //troca elementos de lugar
                        int temp = vetor[i-1];      //variavel temporaria para realizar a troca de vetores
                        vetor[i-1] = vetor[i];
                        vetor[i] = temp;
                        houveTroca = true;   //indica que uma troca ocorreu
                    }
                }
            } while (houveTroca);   //continua enquanto houve trocas

            System.out.println("Vetor ordenado: ");
            for (int i = 0; i < vetor.length; i++){
                System.out.println(vetor[i] + " ");
            }

    }
}
