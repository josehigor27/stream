package Lambda.Predicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998),new Car("red", 2019));
    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"red"));
        System.out.println(filterCarByColor(cars,"black"));

    }

    public static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filterCar = new ArrayList<>();
        for(Car car: cars){
            if(car.getColor().equals(color)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }
}
