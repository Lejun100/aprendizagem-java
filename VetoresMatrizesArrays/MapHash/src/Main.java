import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Double> notasAlunos = new HashMap<>();

        //adicionando elementos no mapa
        notasAlunos.put("Maria", 9.5);
        notasAlunos.put("Jun", 7.8);
        notasAlunos.put("Vrdd", 6.9);

        System.out.println("Nota de Jun: " + notasAlunos.get("Jun"));

        notasAlunos.put("Jun", 8.7);
        System.out.println("Nota atualizada: " + notasAlunos.get("Jun"));

        notasAlunos.remove("Vrdd");
        System.out.println("Mapa após remoção de Vrdd: " + notasAlunos);

        System.out.println("Lista de alunos e suas notas: ");
        for (Map.Entry<String, Double> entrada : notasAlunos.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());   //get key pra recuperar a chave e value para o valor dentro da chave
        }


    }
}