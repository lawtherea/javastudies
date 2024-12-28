import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int soma = 0;

        while (entrada != 0){
            soma += entrada;
            entrada = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}