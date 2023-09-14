package Lambda.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {
    public static void main(String[] args) {
        System.out.println("Exemplo - Curso DIO");

        Supplier<String> helloWorld = () -> "Hello World";
        List<String> list = Stream.generate(helloWorld).limit(5).toList();
        list.forEach(s -> System.out.println(s));

    }
}
