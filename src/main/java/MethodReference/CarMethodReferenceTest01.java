package MethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarMethodReferenceTest01 {
    private static List<Car> listCar = List.of(
                                    new Car("Civic",2011),
                                    new Car("Audi",2022),
                                    new Car("VW",2013));


    static List<Car> order(List<Car> list){
        if(!list.isEmpty()){
            List<Car> orderedCar = new ArrayList<>(list);
            orderedCar.sort(Comparator.comparingInt(Car::getAno));
            return orderedCar;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }


    public static void main(String[] args) {
        System.out.println(order(listCar));
    }
}
