import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] age = new int[n];
        int maiorIdade = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (age[i] > maiorIdade) {
                maiorIdade = age[i];
                posicaoMaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + name[posicaoMaior]);

        sc.close();
    }
}