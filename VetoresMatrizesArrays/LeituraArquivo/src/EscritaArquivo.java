import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EscritaArquivo {
    public static void main(String[] args) {
        List<String> linhas = Arrays.asList("Leandro Jun", "Lionel Messi", "Kaoru Mitoma");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saida.txt", true))) {
            for (String linha : linhas){
                bw.write(linha);
                bw.newLine();   //adiciona quebra de linha
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
