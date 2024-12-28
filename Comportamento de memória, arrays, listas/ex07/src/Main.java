import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + ", " + j);
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j < m-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i > 0){
                        System.out.println("Top: " + mat[i-1][j]);
                    }
                    if (i < n-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}