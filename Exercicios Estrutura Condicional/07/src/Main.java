import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0.0 && y > 0.0){
            System.out.print("Q1");
        }
        else if (x > 0.0 && y < 0.0){
            System.out.print("Q4");
        }
        else if (x < 0.0 && y > 0.0){
            System.out.print("Q2");
        }
        else if (x < 0.0 && y < 0.0){
            System.out.print("Q3");
        }
        else{
            System.out.print("Origem");
        }


    }
}