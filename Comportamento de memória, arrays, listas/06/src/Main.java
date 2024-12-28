import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");

        int n = sc.nextInt();
        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] vectr = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vect1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vect2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            vectr[i] = vect1[i] + vect2[i];
            System.out.println(vectr[i]);
        }

        sc.close();
    }
}