package exercicio_3;

public class App {
    public static void main(String[] args) {

        try {
            Produto produto = new Produto("H2OH 2L", 10, 4.50);
        }

        catch (NomeException | PrecoException | QuantidadeException e) {
            Logs.emTela(e.getMessage(), Logs.Severidade.ERRO);
        }
    }
}
