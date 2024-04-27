import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    double valor = scanner.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));
                }
                case 2 -> {
                    double valor = scanner.nextDouble();
                    if (valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));
                    } else System.out.println("Saldo insuficiente.");
                }
                case 3 -> {
                    System.out.println("Saldo atual: ".concat(String.valueOf(saldo)));
                }
                case 4, 0 -> {
                    System.out.println("Programa encerrado.");
                    return;
                }
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
    }
}