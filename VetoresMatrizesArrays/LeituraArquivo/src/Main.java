import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lejun\\IdeaProjects\\OrientacaoObjetos\\VetoresMatrizesArrays\\LeituraArquivo\\src\\alunos.txt");   //cria objeti dentro do java.io

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
             String linha;
             while ((linha = br.readLine()) != null){    //readline le tosas as linhas, se tiver algum conteudo ele ira exibir
                 System.out.println(linha);
             }
        }catch (FileNotFoundException e){
            System.err.println("Arquivo não encontrado");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}