import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabalhoParte2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes com -M ou -F no final significando o sexo da pessoa e também separados por vírgula(Exemplo: Vanessa-F, Douglas-M, etc.):");
        String input = s.nextLine();
        String[] arraySeparado = input.split(",");

        List<String> usuariosMasculinos = new ArrayList<>();
        List<String> usuariosFemininos = new ArrayList<>();

        for (String usuario : arraySeparado) {

            String[] partes = usuario.trim().split("(?=-)");


            if (partes.length > 1 && partes[1].equalsIgnoreCase("-M")) {
                usuariosMasculinos.add(partes[0]);
            } else if (partes.length > 1 && partes[1].equalsIgnoreCase("-F")) {
                usuariosFemininos.add(partes[0]);
            }
        }


        usuariosMasculinos.sort(String::compareToIgnoreCase);
        usuariosFemininos.sort(String::compareToIgnoreCase);


        System.out.println("Lista de homens:");
        for (String homem : usuariosMasculinos) {
            System.out.println(homem);
        }

        System.out.println("Lista de mulheres:");
        for (String mulher : usuariosFemininos) {
            System.out.println(mulher);
        }
    }
}
