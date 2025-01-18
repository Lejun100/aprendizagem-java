import java.util.Scanner;

public class GerenciadorEstoque {

    public static void main(String[] args) {
        //String[] produtosEstoque = {"Nptebook", "Smartphone", "Tablet", "Fone de ouvido", "Carrega"};

        String[] produtosEstoque = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<produtosEstoque.length; i++){
            System.out.println("Digite o nome do produto " + (i+1));
            produtosEstoque[i] = sc.next() + sc.nextLine();
        }
//        for (int i = 0; i < produtosEstoque.length; i++){
//            System.out.println(produtosEstoque[i]);
//        }

        //String produtoProcurado = "Tablet";  //vetor para verificar produto no estoque
        System.out.println("Digite o nome do produto procurado");
        String produtoProcurado = sc.next() + sc.nextLine();

        boolean produtoEncontrado = false;    //usamos o false pois ainda nao percorreu o estoque, ate que encontre o produto que procuramos sera vrdd
        int i = 0;
        while (!produtoEncontrado && i < produtosEstoque.length){
            if (produtosEstoque[i].equals(produtoProcurado)){
                produtoEncontrado = true;
            }
            i++;
        }

        if (produtoEncontrado){
            System.out.println(produtoProcurado + " está disponível no estoque.");
        } else {
            System.out.println(produtoProcurado + " não está no estoque.");
        }
    }
}
