import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.printf("primeiro\n");
            }
            else if (x > 0 && y < 0) {
                System.out.printf("quarto\n");
            }
            else if (x < 0 && y < 0) {
                System.out.printf("terceiro\n");
            }
            else if (x < 0 && y > 0) {
                System.out.printf("segundo\n");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}