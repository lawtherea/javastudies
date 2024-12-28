import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            //fazer FileWriter(path, true) se quiser acrescer em relação a o que já tinha no arquivo e
            // não substituir
            for (String line : lines) {
                bw.write(line); //escreve a linha
                bw.newLine(); //quebra de linha
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}