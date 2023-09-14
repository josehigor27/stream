package Lambda.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest01 {
    public static void main(String[] args) {
        System.out.println("DEV DOJO");
        List<String> strings = List.of("Luffy", "Naruto", "Gon");
        List<Integer> integers = mapTest(strings, (String s) -> s.length());
        System.out.println(integers);
    }

    private static <T, R> List<R> mapTest(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
