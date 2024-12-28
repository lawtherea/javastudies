import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int valor = 0;
        int in = 0;
        int out = 0;

        for (int i = 0; i < entrada; i++) {
            valor = sc.nextInt();
            if (valor >= 10 && valor <= 20) {
                in++;
            }
            else{
                out++;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

        sc.close();
    }
}