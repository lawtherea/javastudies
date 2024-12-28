import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); //adiciona numa posição específica

        //list.remove("Anna"); // remove a partir do valor
        //list.remove(1); //remove a partir da posicao
        list.removeIf(x -> x.charAt(0) == 'M'); //remove se começar com M

        System.out.println(list.size()); // tamanho da lista
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //posicao de bob

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        //acha o primeiro elemento que começa com A, se nao tiver, retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}