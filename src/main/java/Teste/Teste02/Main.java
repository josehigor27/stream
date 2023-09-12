package Teste.Teste02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        List<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa (1.71,"Fulano 3"));
        list.add(new Pessoa (1.79,"Fulano 1"));
        list.add(new Pessoa (1.61,"Fulano 2"));
        list.add(new Pessoa (1.91,"Fulano 4 "));

        System.out.println(ordenacaoPessoa.ordenarPorAltura(list).toString());
    }
}
