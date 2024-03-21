package exercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insira um número inteiro: ");
            int entrada1 = scanner.nextInt();

            System.out.println("Insira um segundo número: ");
            int entrada2 = scanner.nextInt();

            System.out.println("A soma dos números é: " + (entrada1 + entrada2));
        } catch (InputMismatchException e) {
            System.out.println("Você digitou uma letra ou caractere especial. Apenas números inteiros são válidos.");
        } finally {
            System.out.println("Algoritmo concluído.");
        }

        System.out.println("Programa finalizado.");
    }
}
