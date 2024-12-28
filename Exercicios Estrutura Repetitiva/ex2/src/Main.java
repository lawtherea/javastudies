import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < entrada; i++) {
            soma += sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}