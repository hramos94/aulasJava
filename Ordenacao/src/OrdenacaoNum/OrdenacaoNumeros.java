package OrdenacaoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

    private List<Integer> numerosLista;

    public OrdenacaoNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosLista.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> novaOrdenacao = new ArrayList<>(numerosLista);
        Collections.sort(novaOrdenacao);
        return novaOrdenacao;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> novaOrdenacao = new ArrayList<>(numerosLista);
        novaOrdenacao.sort(Collections.reverseOrder());
        return novaOrdenacao;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(999);
        ordenacao.adicionarNumero(34);
        ordenacao.adicionarNumero(55);
        ordenacao.adicionarNumero(112);
        ordenacao.adicionarNumero(51);
        System.out.println(ordenacao.ordenarAscendente());
        System.out.println(ordenacao.ordenarDescendente());
    }
}
