package apple;

import apple.iphone.Celular;

public class Aparelho {
    public static void main(String[] args) {
        Celular cell = new Celular();
        cell.ligar();
        cell.atender();
        cell.iniciarCorreioVoz();
        cell.exibirPagina();
        cell.adicionarNovaAba();
        cell.atualizarPagina();
        cell.tocar();
        cell.pausar();
        cell.selecionarMusica();
    }
}
