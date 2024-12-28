import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        double sum = 0;
        int qntPar = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                sum += vetor[i];
                qntPar++;
            }
        }
        double avg = sum / qntPar;
        if (qntPar > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
        }
        else{
            System.out.print("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}