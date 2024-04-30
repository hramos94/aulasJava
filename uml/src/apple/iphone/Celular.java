package apple.iphone;

import apple.funcoes.AparelhoTelefonico;
import apple.funcoes.NavegadorNaInternet;
import apple.funcoes.RepodutorMusicial;

public class Celular implements AparelhoTelefonico, NavegadorNaInternet, RepodutorMusicial {

    @Override
    public void ligar() {
        System.out.println("Aparelho ligando");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aparelho iniciando correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }
}
