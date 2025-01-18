import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTestwe {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();


        //adicionando elementos
        System.out.println("Adicionando 'Maçã': " + frutas.add("Maçã"));   //deve retornar true
        System.out.println("Adicionando 'banana': " + frutas.add("banana"));
        System.out.println("Tetando adicionar Maçã novamente: " + frutas.add("Maçã"));   //deve retornar false

        //verificando se o conjunto tem um elemento
        System.out.println("Conjunto contém 'banana': " + frutas.contains("banana"));  //true
        System.out.println("COnjunto contém 'laranja'" + frutas.contains("laranja"));   //false

        //removendo elemento
        System.out.println("Removanendo 'banana': " + frutas.remove("banana"));   //true
        System.out.println("Removendo 'laranja: " + frutas.remove("laranja"));   //false

        //verificando o tamanho do cojunto
        System.out.println("Número de elementos no conjunto: " + frutas.size());   //deve ser 1

        //verificando se está vazio
        System.out.println("Conjunto está vazio: " + frutas.isEmpty());   //false

        //percorrendo o set e exibindo o valor do item
        for (String item : frutas){
            System.out.println(item);
        }

        //limpar
        frutas.clear();
        System.out.println("Conjunto após limpar: " + frutas);    //deve ser{}
        System.out.println("COnjunto está vazio: " + frutas.isEmpty());

    }
}
