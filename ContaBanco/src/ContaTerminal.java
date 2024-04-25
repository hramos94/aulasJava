import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        final int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        final String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome !");
        final String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        final double saldo = scanner.nextDouble();

        System.out.println("Ola ".concat(nomeCliente).concat(" obrigado por criar uma conta em nosso banco, sua " +
                "agência" + " é ").concat(agencia).concat(" conta ").concat(String.valueOf(numero)).concat(" e seu " +
                "saldo ").concat(String.valueOf(saldo)).concat(" já está disponível para saque."));
    }
}
