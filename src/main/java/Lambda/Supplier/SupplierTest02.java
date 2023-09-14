package Lambda.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest02 {
    public static void main(String[] args) {

        List<String> list = Stream.generate(new Supplier<String>() {

            @Override
            public String get() {
                return "Hello World Again";
            }
        }).limit(5).toList();

        list.forEach(s->System.out.println(s));


        System.out.println("-------------------------------------------------------");

        List<Integer> list2 = Stream.generate(()-> 1).limit(5).toList();
        list2.forEach(System.out::println);
    }
}
