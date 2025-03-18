package cadastrohospedes;

import java.util.Scanner;

public class CadastroHospedes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String options = "";
        String[] hospedes = new String[15];
        int numHospedes = 0;

        do {
            System.out.println("---------------\nEscolha uma opção: \n1. Cadastrar Usuários.\n2. Pesquisar Usuários.\n3. Sair.\n⚠.️ Qualquer outra tecla é ignorada. \n---------------");
            options = input.nextLine();
            if (options.equals("1")) {
                System.out.println("Digite o nome do hóspede: ");
                hospedes[numHospedes] = input.nextLine();
                numHospedes++;

                if (numHospedes == 14) {
                    System.out.println("Número máximo atingido");
                }
            }
            if (options.equals("2")) {
                System.out.println("Informe um nome de hóspede: ");
                String nomeHospede = input.nextLine();
                String mensagem = "";
                for (int i = 0; i <= 14; i++) {
                    if (nomeHospede.equals(hospedes[i])) {
                        mensagem = "Nome Encontrado no índice: " + (i + 1);
                    }
                }

                if (mensagem.equals("")) {
                    System.out.println("hóspede não encontrado.");
                }
                System.out.println(mensagem);
            }
            if (options.equals("3")) {
                System.out.println("Você escolheu sair.");
            }
        } while (!options.equals("3"));
    }
}
