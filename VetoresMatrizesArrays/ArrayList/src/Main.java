import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criaçáo de uma lista de strings
        List<String> cores = new ArrayList<>();

        //adição de elementos
        cores.add("red");
        cores.add("blue");
        cores.add("green");
        cores.add("yelow");

        //acesso elemento
        System.out.println("Elemento na posição 2: " + cores.get(2));

        //modificaçao de um elemento
        cores.set(2, "purple");
        System.out.println("Lista após modificar o elemento na posição 2: " + cores);

        //remoção de elemento
        cores.remove("yelow"); //pelo obj
        cores.remove(0);  //pelo índice
        System.out.println("Lista após remoção: "   + cores);

        //tamanho lista
        System.out.println("Tamanho da lista: " + cores.size());

        //verificar se o elemento está presente
        if (cores.contains("blue")){
            System.out.println("A lista contém a cor azul");
        }

        //percorre a lista e imprime a posição e o valor do elemento
        for (int i=0; i<cores.size(); i++){
            System.out.println("cor [" + i + "] = " + cores.get(i));
        }

        //limpar a lista
        cores.clear();
        System.out.println("Lista apos limpar: " + cores);

        //verificar se a lista está vazia
        if (cores.isEmpty()){
            System.out.println("A lista está vazia");
        }

        for (String cor: cores){
            System.out.println(cor);
        }

    }

}