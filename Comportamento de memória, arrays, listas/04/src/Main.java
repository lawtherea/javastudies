import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int qnt = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                qnt++;
            }
        }
        System.out.println("\n");
        System.out.printf("QUANTIDADE DE PARES = %d%n", qnt);

        sc.close();
    }
}