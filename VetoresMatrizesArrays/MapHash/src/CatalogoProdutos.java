import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogoProdutos {
    public static void main(String[] args) {
        Map<Integer, String> catalogo = new HashMap<>();
        Scanner sc =  new Scanner(System.in);
        int op;

        do {
            System.out.println("Menu");
            System.out.println("1 Adicionar produto");
            System.out.println("2 remover produto");
            System.out.println("3 atualizar produto");
            System.out.println("4 listar produtos");
            System.out.println("0 sair");
            op = sc.nextInt();
            sc.nextLine();

            int id;
            String nome;

            switch (op){
                case 1:
                    System.out.println("Digite o id do produto: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    if (!catalogo.containsKey(id)){
                        catalogo.put(id, nome);
                        System.out.println("Cadastrado com sucesso");
                    } else {
                        System.out.println("Id ja registrado");
                    }
                    break;
                case 2:
                    System.out.println("Digite o id para remover");
                    id = sc.nextInt();
                    if (catalogo.remove(id) != null){
                        System.out.println("Produto removido");
                    } else {
                        System.out.println("Produto não removido");
                    }
                    break;
                case 3:
                    System.out.println("Digite id para atualizar produto");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do produto");
                    nome = sc.nextLine();
                    if (catalogo.containsKey(id)){
                        catalogo.put(id, nome);
                        System.out.println("Atualizado com sucesso");
                    } else{
                        System.out.println("Produto nao encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Listagem dos produtos");
                    for (Map.Entry<Integer, String> produto : catalogo.entrySet()){
                        System.out.println("ID: " + produto.getKey() + " Nome" + produto.getValue());
                    }
                    break;
                case 0:
                    System.out.println("Finalizando");
                    sc.close();
                    break;
                default:
                    System.out.println("opção invaldia");
            }
        }while (op !=0);
        sc.close();

    }
}
