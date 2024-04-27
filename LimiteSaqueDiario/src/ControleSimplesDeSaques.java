import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = 0;
        // Crie um loop 'for' para iterar sobre os saques:
        for (int x = 0; 0 < limiteDiario; x++) {
            // Solicite ao usuário o valor do saque:
            saque = scanner.nextDouble();
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            // Verifique se o valor do saque é zero, encerrando as transações:
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
                // Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            } else if (saque <= limiteDiario) {
                //Informe que o saque foi realizado e mostre o limite restante:
                limiteDiario = limiteDiario - saque;
                System.out.println("Saque realizado. Limite restante: ".concat(String.valueOf(limiteDiario)));
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}