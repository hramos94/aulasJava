import Cliente.Cliente;
import Contas.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createMock();
        System.out.println(Conta.mostrarTop3());
    }

    public static void createMock() {
        Cliente venilton = new Cliente("Venilton");
        Cliente heitor = new Cliente("heitor");
        Cliente jogador = new Cliente("jogador");
        Cliente maluco = new Cliente("maluco");
        Cliente rico = new Cliente("rico");
        Cliente pobre = new Cliente("pobre");
        Cliente humilde = new Cliente("humilde");
        Cliente teste = new Cliente("teste");

        Conta ven = new ContaCorrente(venilton, TipoConta.CONTA_PREMIUM.toString());
        Conta hei = new ContaCorrente(heitor, TipoConta.CONTA_PREMIUM.toString());
        Conta jog = new ContaCorrente(jogador, TipoConta.CONTA_SIMPLES.toString());
        Conta mal = new ContaCorrente(maluco, TipoConta.CONTA_PLUS.toString());
        Conta ric = new ContaCorrente(rico, TipoConta.CONTA_PLUS.toString());
        Conta pob = new ContaCorrente(pobre, TipoConta.CONTA_SIMPLES.toString());
        Conta hum = new ContaCorrente(humilde, TipoConta.CONTA_SIMPLES.toString());
        Conta test = new ContaCorrente(teste, TipoConta.CONTA_PREMIUM.toString());

        Random random = new Random();
        ven.depositar(random.nextDouble(5000));
        hei.depositar(random.nextDouble(5000));
        jog.depositar(random.nextDouble(5000));
        mal.depositar(random.nextDouble(5000));
        ric.depositar(random.nextDouble(5000));
        pob.depositar(random.nextDouble(5000));
        hum.depositar(random.nextDouble(5000));
        test.depositar(random.nextDouble(5000));
    }
}