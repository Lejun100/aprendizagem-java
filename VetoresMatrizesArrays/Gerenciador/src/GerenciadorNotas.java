import java.util.Scanner;

public class GerenciadorNotas {

    public static void main(String[] args) {
        //double[] notasAlunos = {7.5, 8.0, 9.0, 6.5, 8.0};
        double[] notasAlunos = new double[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notasAlunos.length; i++){
            System.out.println("Digite a nota " + (i+1)); //o i+1 retorna o tamanho das notas
            notasAlunos[i] = sc.nextDouble();
        }

        double somaNotas = 0;
        for (int i = 0; i < notasAlunos.length; i++){
            somaNotas += notasAlunos[i];
        }

        double media = somaNotas / notasAlunos.length;    //vai somando no notasAluno os dados e armazena no somaNotas, depois usamos o valor somado e dividimos pelo tamanho do notasAluno

        System.out.println("Média do aluno: " + media);
        if (media >= 7.0){
            System.out.println("Passou brabo demais");
        } else {
            System.out.println("Reprovou HAHAHA");
        }
    }
}
