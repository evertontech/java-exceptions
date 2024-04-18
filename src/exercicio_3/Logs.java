package exercicio_3;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logs {
    public enum Severidade {
        INFO,
        ERRO;
    }

    private static String escrever(String mensagem, Severidade severidade) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "[" + severidade + "]" + "[" + LocalDateTime.now().format(format) + "]: " + mensagem;
    }

    public static void emTela(String mensagem, Severidade severidade) {
        System.out.println(escrever(mensagem, severidade));
    }

    public static void emArquivo(String mensagem, Severidade severidade)  {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("logs.txt", true))) {
            bw.write(escrever(mensagem, severidade));
        }
        catch (IOException e) {
            emTela(e.getMessage(), Logs.Severidade.ERRO);
        }
    }

    public static void emTodos(String mensagem, Severidade severidade)  {
        emTela(mensagem, severidade);
        emArquivo(mensagem, severidade);
    }
}
