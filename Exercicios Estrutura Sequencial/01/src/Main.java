//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//        mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        int z = x+y;
        System.out.printf("SOMA = %d", z);

        sc.close();
    }
}