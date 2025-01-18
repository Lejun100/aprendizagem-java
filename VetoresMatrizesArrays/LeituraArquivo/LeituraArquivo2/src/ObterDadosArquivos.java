import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class ObterDadosArquivos {
    public static void main(String[] args) {
        Path file = Paths.get("saida.txt");
        try {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("Tamanho: " + attr.size());
            System.out.println("Data de criação: " + attr.creationTime());
            System.out.println("Última data de modificação: " + attr.lastModifiedTime());
            System.out.println("É um diretório? " + attr.isDirectory());
    } catch (IOException e){
            e.printStackTrace();
        }
    }
}
