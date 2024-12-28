import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            height[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            gender[i] = sc.next().charAt(0);
        }

        double menorAltura = height[0];
        double maiorAltura = height[0];

        for (int i = 0; i < n; i++) {
            if (height[i] < menorAltura) {
                menorAltura = height[i];
            }
            if (height[i] > maiorAltura) {
                maiorAltura = height[i];
            }
        }

        int qntF = 0;
        int qntM = 0;
        double alturaFemTotal = 0.0;
        double alturaFemMedia = 0.0;

        for (int i = 0; i < n; i++) {
            if (gender[i] == 'F') {
                qntF++;
            }
            if (gender[i] == 'M') {
                qntM++;
                alturaFemTotal = alturaFemTotal + height[i];
            }
        }

        alturaFemMedia = alturaFemTotal / qntF;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n" + alturaFemMedia);
        System.out.println("Numero de homens " + qntM);

        sc.close();
    }
}