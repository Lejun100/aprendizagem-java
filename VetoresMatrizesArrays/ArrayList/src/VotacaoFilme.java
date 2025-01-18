import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VotacaoFilme {

    public static void main(String[] args) {
        List<String> filmes = Arrays.asList("Oppenheimer", "Clube da luta", "Coringa");
        //lista para armazenar os votos de cada filme, iniciando os votos com zero
        ArrayList<Integer> votos = new ArrayList<>(Arrays.asList(0, 0, 0));

        Scanner sc = new Scanner(System.in);

        //exibindo a lista
        System.out.println("Vote no filme preferido");
        for (int i = 0; i<filmes.size(); i++){
            System.out.println((i+1) + ". " + filmes.get(i));
        }

        System.out.println("\nDIgite o número do filme preferido/ 0 para encerrar a votação");
        int voto;
        do {
            voto = sc.nextInt();
            if (voto > 0 && voto <= filmes.size()){
                int indice = voto - 1;
                votos.set(indice, votos.get(indice) + 1);
            } else if (voto!=0){
                System.out.println("opção inválida");
            }
        }while (voto != 0);

        //contando votos
        int maxVotos = 0;
        int indiceVencedor = -1;
        for (int i=0; i<votos.size(); i++){
            if (votos.get(i)>maxVotos){
                maxVotos = votos.get(i);
                indiceVencedor = i;
            }
        }

        if (indiceVencedor != -1){
            System.out.println("O filme escolhido é: " + filmes.get(indiceVencedor) + " com " + maxVotos);
        } else {
            System.out.println("Nenhum filme recebeu votos");
        }
        sc.close();
    }
}
