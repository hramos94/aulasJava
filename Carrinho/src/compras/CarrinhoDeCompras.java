package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    void adcionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> auxListItems = new ArrayList<>();
        for (Item it : itens) {
            if (it.getNome().equalsIgnoreCase(nome)) {
                auxListItems.add(it);
            }
        }
        itens.removeAll(auxListItems);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item it : itens) {
            valorTotal = valorTotal + it.getPreco() * it.getQuantidade();
        }
        return valorTotal;
    }

    public List<Item> exibirItens() {
        return itens;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Quantidade de itens no carrinho: " + carrinho.exibirItens());

        carrinho.adcionarItem("coca", 10, 2);
        carrinho.adcionarItem("pepsi", 5, 4);
        carrinho.adcionarItem("pepsi", 5, 4);
        carrinho.adcionarItem("agua", 5.5, 2);

        System.out.println("Quantidade de itens no carrinho: " + carrinho.exibirItens());

        carrinho.removerItem("pepsi");

        System.out.println("Quantidade de itens no carrinho: " + carrinho.exibirItens());

        System.out.println("Valor total: " + carrinho.calcularValorTotal());

    }
}
