//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, horas;
        double valor, salario;

        num = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        salario = valor * horas;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f" , num, salario);

        sc.close();
    }
}