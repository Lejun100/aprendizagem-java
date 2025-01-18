import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiaArquivos {
    public static void main(String[] args) {
        try{
            Path origem = Paths.get("saida.txt");
            Path destino = Paths.get("exemplo_copiado.txt");
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);    //vai copiar
            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
