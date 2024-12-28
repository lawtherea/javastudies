import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int a = 0;
        int b = 0;
        double divisao = 0;

        for (int i = 0; i < entrada; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (b == 0){
                System.out.printf("divisao impossivel\n");
            }
            else{
                divisao = (double) a / b;
                System.out.printf("%.1f%n", divisao);
            }

        }

        sc.close();
    }
}