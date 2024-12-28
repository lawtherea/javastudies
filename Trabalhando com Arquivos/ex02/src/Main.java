import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            //a partir de fr instanciamos br pois deixa mais flexivel o
            // sistema de leitura de arquivos

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }

    }
}