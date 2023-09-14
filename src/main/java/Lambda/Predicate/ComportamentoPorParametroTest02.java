package Lambda.Predicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green",2011),
                                            new Car("black",1998),
                                            new Car("red", 2019),
                                            new Car("red",2022));
    public static void main(String[] args) {
        //O comportamento é desenvolvido na sub-classe

        System.out.println(filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        }));
        //Sout utilizando lambdas
        System.out.println(filter(cars, car -> car.getColor().equals("red")));

    }

    public static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for(Car car: cars){
            if(carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
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
