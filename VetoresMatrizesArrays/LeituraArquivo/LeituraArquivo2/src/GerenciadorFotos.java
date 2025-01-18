import java.awt.image.RasterOp;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class GerenciadorFotos {
    private static final String DIRETORIO_FOTOS = "Fotos";

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
        Path diretorioFotos = Paths.get(DIRETORIO_FOTOS);
        if (Files.notExists(diretorioFotos)){
            Files.createDirectory(diretorioFotos);
        }

        int op;

        do {
            System.out.println("gerenciador de fotos: ");
            System.out.println("1 Listar fotos");
            System.out.println("2 copiar foto");
            System.out.println("3 remover foto");
            System.out.println("4 visualizar info");
            System.out.println("5 sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    listarFotos(diretorioFotos);
                    break;
                case 2:
                    copiarFotos(diretorioFotos);
                    break;
                case 3:
                    excluirFotos(diretorioFotos);
                    break;
                case 4:
                    visualizarFotos(diretorioFotos);
                    break;
                case 5:
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (op != 0);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void listarFotos(Path diretorio) throws IOException{
        System.out.println("Fotos: ");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(diretorio)) {
            for (Path arquivo : stream){
                if (!Files.isDirectory(arquivo)){
                    System.out.println(arquivo.getFileName());
                }
            }
        }
    }

    private static void copiarFotos(Path diretorio) throws IOException{
        System.out.println("Nome da foto para copiar: ");
        Path fotoOriginal = diretorio.resolve(sc.nextLine());

        System.out.println("Diretório de destino: ");
        Path destino = Paths.get(sc.nextLine());
        if (Files.notExists(destino)){
            Files.createDirectories(destino);
        }

        Path fotoDestino = destino.resolve(fotoOriginal.getFileName());
        Files.copy(fotoOriginal, fotoDestino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Foto copiada com sucesso!");
    }

    private static void excluirFotos(Path diretorio) throws IOException{
        System.out.println("Nome da foto a ser excluida: ");
        Path foto = diretorio.resolve(sc.nextLine());

        Files.deleteIfExists(foto);
        System.out.println("Foto excluída com sucesso!");
    }

    private static void visualizarFotos(Path diretorio) throws IOException{
        System.out.println("Nome da foto para visualizar fotos: ");
        Path foto = diretorio.resolve(sc.nextLine());

        BasicFileAttributes attrs = Files.readAttributes(foto, BasicFileAttributes.class);
        System.out.println("Informações da foto: ");
        System.out.println("Tamanho: " + attrs.size() + " bytes");
        System.out.println("Data de criação: " + attrs.creationTime());
        System.out.println("Última modificação: " + attrs.lastModifiedTime());
        System.out.println("Caminho: " + foto.toAbsolutePath());
    }
}
