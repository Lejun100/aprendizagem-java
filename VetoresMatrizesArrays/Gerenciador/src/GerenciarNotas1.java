public class GerenciarNotas1 {

    public static void main(String[] args) {

        double[][] notasEstudantes = {
            {7.5, 8.0, 9.0},
            {6.0, 5.6, 8.9},
                {5.7, 6.7, 8.2},
        };

        //calcula e exibe a media das notas para cada estudante
        for(int i = 0; i < notasEstudantes.length; i++){
            double somaNotas = 0;
            for (int j = 0; j < notasEstudantes[i].length; j++){
                somaNotas += notasEstudantes[i][j];
            }
            double media = somaNotas / notasEstudantes[i].length;
            System.out.printf("Média do estudante %d: %.2f\n", i +1, media);
        }
    }
}
