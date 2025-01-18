import java.io.*;
import java.util.Scanner;

public class GerenciadorListaCompras {
    public static void main(String[] args) {
        adicionarItem();
        exibirLista();
    }

    public static void adicionarItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um item para adicionar à lista de compras");

        String item = sc.nextLine();

        while (!item.equalsIgnoreCase("sair")){
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("listadecompras.txt", true))) {
                bw.write(item);
                bw.newLine();
                System.out.println("Item '" + item + "' adicionado com sucesso!");
            } catch (IOException e){
                System.err.println("Erro ao escrever no arquivo.");
                e.printStackTrace();
            }

            System.out.println("Digite outro item (ou sair para finalizar)");
            item = sc.nextLine();
        }
    }

    public static void exibirLista(){
        System.out.println("Lista de compras: ");
        try (BufferedReader br = new BufferedReader(new FileReader("listadecompras.txt"))){
            String itemLido;
            while ((itemLido = br.readLine()) != null){
                System.out.println("- " + itemLido);
            }
        } catch (IOException e){
            System.err.println("Erro ao ler o arquivo");
            e.printStackTrace();
        }
    }
}
