import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RemoverArquivos {
    public static void main(String[] args) {
        try {
            Files.delete(Path.of("exemplo_copiado.txt"));
            System.out.println("Arquivo deletado com sucesso!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
