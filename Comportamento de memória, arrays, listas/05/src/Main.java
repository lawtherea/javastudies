import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] v = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            v[i] = sc.nextDouble();
        }

        double maior = v[0];
        int posicao = 0;
        for (int i = 1; i < n; i++) {
            if (v[i] > maior) {
                maior = v[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicao);


        sc.close();
    }
}