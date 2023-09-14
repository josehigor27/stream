package Lambda.Consumer;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest02 {


    public static void main(String[] args) {
        System.out.println("---------------DEVDOJO--------------------");
        List <Integer> integers = List.of(1,2,3,4,5,6,7);
        forEach(integers,(Integer i) -> System.out.println(i));
        System.out.println("---------------DEVDOJO--------------------");
        integers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer % 2 ==0){
                    System.out.print( integer);
                }
            }
        });
        System.out.println("-----------------CURSO DIO-------------------------");
        integers.stream().forEach(n -> {
            if (n % 2 ==0){
                System.out.println(n);
            }
        });

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
