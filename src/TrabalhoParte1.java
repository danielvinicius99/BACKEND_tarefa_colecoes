import java.util.Scanner;

public class TrabalhoParte1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgula:");
        String input = s.nextLine();
        String[] arraySeparado = input.split(",");


        System.out.println("Nomes separados por vírgula:");
        for (String nome : arraySeparado) {
            System.out.println(nome.trim());
        }
    }
}
