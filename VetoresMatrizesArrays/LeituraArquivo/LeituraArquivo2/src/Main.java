import java.io.IOException;
import java.nio.file.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Path dir = Paths.get("src/main");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for (Path file : stream){       //interamos todos os diretorios dentro do for,
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e){
            e.printStackTrace();
        }

    }
}