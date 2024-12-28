import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int y = 32;
//        double x = 10.329180;
//        System.out.println(y); //ln tem quebra de linha
//        System.out.println(x);
//        System.out.printf("%.2f%n", x);
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.2f%n", x);
//
//        System.out.println("RESULTADO = " + x + " METROS");
//        System.out.printf("RESULTADO = %.2f metros%n", x);

//        String nome = "Maria";
//        int idade = 31;
//        double renda = 4000.0;
//        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);

//        -------------------------------------------
//
//        String product1 = "Computer";
//        String product2 = "Office desk";
//        int age = 30;
//        int code = 5290;
//        char gender = 'F';
//
//        double price1 = 2100.0;
//        double price2 = 650.50;
//        double measure = 53.234567;
//
//        System.out.printf("Products:\n%s, which price is $%.2f\n%s, which price is $%.2f\n", product1,
//                price1, product2, price2);
//        System.out.println();
//        System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
//        System.out.println();
//        System.out.printf("Measure with eight decimal places: %.8f\nRounded (three decimal places): %" +
//                        ".3f\n", measure, measure);
//        Locale.setDefault(Locale.US);
//        System.out.printf("US decimal point: %.3f", measure);
//
//        -------------------------------------------

//        Scanner sc = new Scanner(System.in);
//        String x = sc.next();
//        System.out.println("Voce digitou: " + x);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Voce digitou: " + x);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        System.out.println("Voce digitou: " + x);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        char x = sc.next().charAt(0); //o num é a posicao do char q vc quer pegar
//        System.out.println("Voce digitou: " + x);
//        sc.close();

//        -------------------------------------------

//        Scanner sc = new Scanner(System.in);
//
//        String s1, s2, s3;
//
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("DADOS DIGITADOS:");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//        sc.close();

//        -------------------------------------------

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }
}