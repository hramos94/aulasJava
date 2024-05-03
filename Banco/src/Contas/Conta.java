package Contas;

import Cliente.Cliente;

import java.util.*;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String tipoConta;

    static List<Conta> contasList = new ArrayList<>();


    public Conta(Cliente cliente, String tipoConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        contasList.add(this);
    }

    @Override
    public void sacar(double valor) {
        if (checarSaldoValor(valor)) {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Por favor, insira um valor maior que zero");
        } else {
            saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.saldo == 0) {
            System.out.println("Você tem zero de saldo para transferir, por favor, deposite.");
        }
        if (checarSaldoValor(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    private boolean checarSaldoValor(double valor) {
        if (this.saldo < valor) {
            System.out.println("Você não tem saldo suficiente para realizar essa operacao.");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }

    public static List<Conta> mostrarTop3() {
        List<Conta> topAll = new ArrayList<>(contasList);
        topAll.sort(new ComparatorPorSaldo().reversed());
        if (topAll.size() > 3) {
            return topAll.subList(0, 2);
        } return topAll.subList(0, topAll.size());
    }

}

class ComparatorPorSaldo implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        return Double.compare(c1.getSaldo(), c2.getSaldo());
    }
}