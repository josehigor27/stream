package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
* Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
* */
public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPares = numeros.stream().filter(num -> num%2==0).toList();
        //System.out.println(numerosPares);
        int result = numerosPares.stream().reduce(0,(n1,n2)->n1+n2);
        System.out.println(result);
    }
}
