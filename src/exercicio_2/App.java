package exercicio_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Double divisao(Integer dividendo, Integer divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("O segundo parâmetro não pode ser zero.");
        }


        return (double) dividendo / divisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insira o primeiro valor");
            int a = scanner.nextInt();

            System.out.println("Insira o segundo valor");
            int b = scanner.nextInt();

            System.out.println("Iniciando operação");
            System.out.println("O valor da divisão é: " + divisao(a, b));

        } catch (IllegalArgumentException e) {
            System.out.println("Mensagem da exceção: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Mensagem de exceção: " + e.getMessage());
        }
    }
}
