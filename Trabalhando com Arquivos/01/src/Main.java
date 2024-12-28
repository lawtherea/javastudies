import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine(); //pega caminho do arquivo

        File sourceFile = new File(sourceFileStr); //atribui sourceFile ao arquivo
        String sourceFolderStr = sourceFile.getParent(); //caminho desprezando nome do arquivo

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); //criando pasta out

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //caminho de novo arquivo summary

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){ //lendo arquivo
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]); //convertendo para double
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product p : list){
                    bw.write(p.getName() + "," + String.format("%.2f", p.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}