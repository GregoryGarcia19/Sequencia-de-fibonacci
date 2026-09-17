import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (N) da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, informe um número inteiro maior que zero.");
        } else {
            long t1 = 0;
            long t2 = 1;

            System.out.println("\nOs primeiros " + n + " termos da Sequência de Fibonacci são:");

            for (int i = 1; i <= n; i++) {
                System.out.print(t1);

                // Adiciona vírgula e espaço entre os números, exceto no último
                if (i < n) {
                    System.out.print(", ");
                }

                // Atualiza os valores para o próximo termo
                long proximoTermo = t1 + t2;
                t1 = t2;
                t2 = proximoTermo;
            }
            System.out.println();
        }

        scanner.close();
    }
}