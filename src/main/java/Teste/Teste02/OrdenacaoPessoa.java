package Teste.Teste02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {


    public List<Pessoa> ordenarPorAltura(List<Pessoa> list){
        if(!list.isEmpty()){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(list);
            //pessoasPorAltura.sort((p1,p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}
