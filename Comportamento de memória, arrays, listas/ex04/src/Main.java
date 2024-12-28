public class Main {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

//        percorre todos os elementos do vetor vect chamando cada um de obj
//        para cada objeto obj contido no vetor vect, faça
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}