import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrabalhoParte1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgula:");
        String input = s.nextLine();
        String[] arraySeparado = input.split(",");


        for (int i = 0; i < arraySeparado.length; i++) {
            arraySeparado[i] = arraySeparado[i].trim();
        }


        List<String> nomes = new ArrayList<>(Arrays.asList(arraySeparado));


        nomes.sort(String::compareToIgnoreCase);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
