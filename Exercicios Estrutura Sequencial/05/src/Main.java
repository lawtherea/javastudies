//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, num, cod2, num2;
        double valor, valor2, total;

        cod = sc.nextInt();
        num = sc.nextInt();
        valor = sc.nextDouble();
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (num*valor)+(num2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}