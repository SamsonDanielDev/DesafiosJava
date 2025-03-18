package quartos.ocupados.e.desocupados;

import java.util.Scanner;

public class QuartosOcupadosEDesocupados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[][] Hotel = new boolean[4][3];
        int andar = 0, quarto = 0;
        String resposta = "S";

        do {

            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Digite o andar.");
                andar = input.nextInt();
                input.nextLine();
                System.out.println("Digite o quarto.");
                quarto = input.nextInt();

                input.nextLine();

                andar -= 1;
                quarto -= 1;

                if ((andar > 3 || andar < 0) || (quarto > 2 || quarto < 0)) {
                    System.out.println("Entrada inválida.");
                } else {
                    Hotel[andar][quarto] = true;
                }
            }

            System.out.println("Deseja informar outra ocupação? (S/N)");
            resposta = input.nextLine();

        } while (!resposta.equalsIgnoreCase("N"));

        for (int i = 0; i <= 3; i++) {
            System.out.println("Andar: " + (i + 1));
            for (int j = 0; j <= 2; j++) {
                if (Hotel[i][j]) {
                    System.out.println("Quarto " + (j + 1) + " ocupado.");
                } else if (!Hotel[i][j]) {
                    System.out.println("Quarto " + (j + 1) + " desocupado.");
                }
            }
        }
    }
}