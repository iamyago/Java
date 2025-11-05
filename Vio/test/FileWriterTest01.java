package academy.devjojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// file - arquivo em si
// FileWriter - para escrever em um arquivo (não é tão otimizada)
// FileReader - so para leitura
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // true serve para ele n excluir e criar novamente a cada mensagem que eu mudar.
        try (FileWriter fw = new FileWriter(file, true)){;
            fw.write("\ndev dojo é bom\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
