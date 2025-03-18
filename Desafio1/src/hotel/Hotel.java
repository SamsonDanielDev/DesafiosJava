package hotel;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de convidados: ");

        int NumConvidados = input.nextInt();

        if (NumConvidados >= 1 && NumConvidados <= 150) {
            System.out.println("Use o auditório alfa");
        } else if (NumConvidados >= 151 && NumConvidados <= 220) {
            System.out.println("Use o auditório alfa, usando cadeiras adicionais: " + (NumConvidados - 150));
        } else if (NumConvidados > 220 && NumConvidados <= 350) {
            System.out.println("Use o auditório beta");
        } else {System.out.println("Número inválido de convidados");}
    }
}
