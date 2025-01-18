import br.com.fiap.loja.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jun");
        cliente.exibirDados();

        System.out.println(cliente.getNome());
    }
}