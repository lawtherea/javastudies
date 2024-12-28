import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double heightsum = 0.0;
        for (int i = 0; i < n; i++) {
            heightsum += height[i];
        }
        double avgheight = heightsum / n;
        System.out.printf("Altura média: %.2f\n", avgheight);

        double menores = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                menores++;
            }
        }
        double percentage = (menores/n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}