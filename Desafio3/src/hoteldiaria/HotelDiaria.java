package hoteldiaria;

import java.util.Scanner;

public class HotelDiaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor padrão da diária: ");
        float ValorDiaria = input.nextFloat();
        float valorTotal = 0f;
        String NomesClientes, continuar = "s";
        int IdadesClientes;
        int gratuidade = 0, meia = 0;

        System.out.println("Insira o nome e a idade dos clientes.");

         while (continuar.equalsIgnoreCase("s")) {
            input.nextLine(); 
            System.out.print("Nome: ");
            NomesClientes = input.nextLine();
            
            System.out.print("Idade: ");
            IdadesClientes = input.nextInt();
            
            if (IdadesClientes < 4) {
                System.out.println(NomesClientes + " possui gratuidade");
                gratuidade++;
            }
            if (IdadesClientes > 80) {
                System.out.println(NomesClientes + " paga meia");
                meia++;
                valorTotal += ValorDiaria / 2;
            }
            if (IdadesClientes >= 4 && IdadesClientes <= 80) {
                valorTotal += ValorDiaria;
            } 
           
             System.out.println("Deseja continuar? (s/n)");
             continuar = input.next();
        }

        System.out.println("Total de valor das hospedagens: " + valorTotal);
        System.out.println("Gratuidade(s): " + gratuidade + " // Meia(s): " + meia);
    }
}