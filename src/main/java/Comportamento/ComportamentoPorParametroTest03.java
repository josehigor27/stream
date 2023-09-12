package Comportamento;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green",2011),
                                            new Car("black",1998),
                                            new Car("red", 2019),
                                            new Car("red",2022));
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,3,4,5,3,22,6);
        System.out.println(filter(nums,num -> num%2==0));

        //Sout utilizando lambdas
        System.out.println(filter(cars, (Car car) -> car.getColor().equals("red")));

    }


    // Alula 194 - Dev Dojo
    /*
    * implementando um método genérico
    * */
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e: list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

    /*
    * O que eu entendi:
    *
    * Nós criamos uma interface CarPredicate que possui um método de teste. Esse método pode ser utilizado
    * para diferentes tipo de pesquis, e em vez de implementar um método para cada tipo de pesquisa,
    * passamo como paramtro uma função lambda, com o que a gente que ter de retorno da nossa Collection
    *
    * */
}
