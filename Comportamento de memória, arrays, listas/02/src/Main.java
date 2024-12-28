import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf(vect[i] + " ");
            sum += vect[i];
        }
        double media = sum / n;
        System.out.println();
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", media);
        
        sc.close();
    }
}