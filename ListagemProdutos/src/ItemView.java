import java.util.Scanner;

public class ItemView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = null;
        int option;
        do {
            System.out.println("Escolha uma opção: \n1 - Novo item \n2 - Exibir item \n3 - Sair.");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do seu novo item:");
                    String nameIten = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do seu novo item:");
                    String descritionIten = sc.next() + sc.nextLine();
                    System.out.println("O novo item é raro?" + "(sim ou não)");
                    boolean rare = sc.nextBoolean();
                    System.out.println("Qual o nível do seu item:");
                    int level = sc.nextInt();
                    item = new Item(nameIten, descritionIten, rare, level);
                    break;

                case 2:
                    if (item != null){
                        System.out.println("Nome: " + item.getn + " Descrição: " + item.descriptionIten + " Raro: " + item.rare + " Level: " + item.level);
                    } else{
                        System.out.println("Nenhum item cadastrado.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(option != 0);
        sc.close();

    }
}
