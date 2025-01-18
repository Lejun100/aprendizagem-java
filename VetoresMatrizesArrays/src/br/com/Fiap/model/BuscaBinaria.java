package br.com.Fiap.model;

public class BuscaBinaria {
    public static void main(String[] args) {
        int [] vetorOrdenado = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int elementoProcurado = 88;
        int inicio = 0;
        int fim = vetorOrdenado.length - 1;
        int posicaoEncontrada = -1;   //assume-se inicialmente que o elemento nao esta presente

        while (inicio <= fim){
            int meio = inicio + (fim -inicio) / 2;

            if (vetorOrdenado[meio] == elementoProcurado){
                posicaoEncontrada = meio;   //elemento encontrado
                break;
            } else if (vetorOrdenado[meio] < elementoProcurado) {
                inicio = meio + 1;        //continua a busca pela metade superior

            } else {
                fim = meio - 1;    //continua a busca pela metade onferior
            }
        }


        if (posicaoEncontrada != -1){
            System.out.println("Elemento encontrado no índice: " + posicaoEncontrada);
        } else {
            System.out.println("ELemento não encontrado no vetor");
        }
    }
}
