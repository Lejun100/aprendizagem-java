import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroEvento {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("Menu");
            System.out.println("1 adicionar participante");
            System.out.println("2 verificar participante");
            System.out.println("3 remover participante");
            System.out.println("4 listar participante");
            System.out.println("0 sair");
            op = sc.nextInt();
            sc.nextLine();

            String nome;

            switch (op){
                case 1:
                    System.out.println("Digite nome do participante");
                    nome = sc.nextLine();
                    if (participantes.add(nome)){
                        System.out.println(nome + "participante adicionado");
                    } else{
                        System.out.println(nome + "participante já adicionado");
                    }
                    break;

                case 2:
                    System.out.println("nome do participante a ser verificado");
                    nome = sc.nextLine();
                    if (participantes.contains(nome)){
                        System.out.println(nome + "participante está verificado");
                    } else {
                        System.out.println(nome + "esse participante nao esta");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do participante para remover");
                    nome = sc.nextLine();
                    if (participantes.remove(nome)){
                        System.out.println(nome + "participante removido com sucesso");
                    } else{
                        System.out.println(nome + "Participante não foi removido");
                    }
                    break;
                case 4:
                    System.out.println("participantes registrados");
                    if (participantes.isEmpty()){
                        System.out.println("Nenhum participante registrado");
                    } else{
                        for (String participante : participantes){
                            System.out.println("- " + participante);
                        }
                    }
                    break;
                case 0:
                    System.out.println("FInalizando");
                    sc.close();
                    break;
                default:
                    System.out.println("opção inválida");

            }
        } while (op != 0);
    }
}
