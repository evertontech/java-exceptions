package teste;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int a = scanner.nextInt();

        System.out.println("Entre com um segundo inteiro");
        int b = scanner.nextInt();

        System.out.println("O número que você digitou foi: " + a / b);


    }
}
