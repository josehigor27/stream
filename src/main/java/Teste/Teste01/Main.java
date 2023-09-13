package Teste.Teste01;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //Sem utilizar função lambda
        for(Integer i: list){
            System.out.println(i);
        }

        //usando função lambda
        list.forEach(n -> System.out.println(n));
    }
}
