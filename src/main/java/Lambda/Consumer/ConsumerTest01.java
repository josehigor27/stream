package Lambda.Consumer;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest01 {


    public static void main(String[] args) {
        List<String> strings = List.of("Naruto", "Ichigo","Orihime","Zorao da massa");
        forEach(strings, (String s) -> System.out.println(s));

        List <Integer> integers = List.of(1,2,3,4,5,6,7);
        forEach(integers,(Integer i) -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
