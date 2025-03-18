package quartos_hotel;

import java.util.Scanner;

public class Quartos_Hotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do primeiro cliente: ");
        String nomeCliente1 = input.nextLine();
        System.out.println("Insira a idade do primeiro cliente: ");
        int idadeCliente1 = input.nextInt();

        input.nextLine();
                
        System.out.println("Insira o nome do segundo cliente: ");
        String nomeCliente2 = input.nextLine();
        System.out.println("Insira a idade do segundo cliente: ");
        int idadeCliente2 = input.nextInt();

        if(idadeCliente1 > idadeCliente2 && idadeCliente1 < 60) {
            System.out.println(nomeCliente2 + " deve ficar no quarto B, e " + nomeCliente1 + " se moverá ao quarto A, sem desconto.");
        } else if(idadeCliente1 < idadeCliente2 && idadeCliente2 < 60) {
            System.out.println(nomeCliente1 + " deve ficar no quarto B, e " + nomeCliente2 + " se moverá ao quarto A, sem desconto.");
        }
        
        if(idadeCliente1 > idadeCliente2 && idadeCliente1 >= 60){
             System.out.println(nomeCliente2 + " deve ficar no quarto B, e " + nomeCliente1 + " se moverá ao quarto A, com desconto de 40%");
        }else if(idadeCliente1 < idadeCliente2 && idadeCliente2 >= 60) {
            System.out.println(nomeCliente1 + " deve ficar no quarto B, e " + nomeCliente2 + " se moverá ao quarto A, com desconto de 40%");
        }
    }
}