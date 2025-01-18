import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();   //novo objeto e armazenou na variavel
        int option;
        do {
            System.out.println("Escolha uma opção: \n 1 - Cadastrar produto\n2 - Exibir produto\n3 - Comprar\n4 - Adicionar estoque\n5 - Aplicar desconto\n0 - Sair.");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade no estoque:");
                    int estoque = sc.nextInt();
                    produto = new Produto(nome, preco, estoque);
                    break;
                case 2:
                    produto.exibirInformacoes();
                    break;
                case 3:
                    System.out.println("Digite a quantidade que deseja comprar:");
                    int qtd = sc.nextInt();
                    produto.comprar(qtd);
                    break;
                case 4:
                    System.out.println("Digite a quantidade para adicionar no estoque:");
                    qtd = sc.nextInt();
                    produto.adicionarEstoque(qtd);
                    break;
                case 5:
                    System.out.println("Digite a porcentagem de desconto:");
                    double desconto = sc.nextDouble();
                    produto.aplicarDesconto(desconto);
                    break;
                case 6:
                    System.out.println("FInalizando compra");
                default:
                    System.out.println("Opção inválida");
            }
        }while(option != 0);
        sc.close();

    }
}