package Lambda.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest02 {
    public static void main(String[] args) {
        //Curso DIO
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> doubleList = n -> n*2;

        List<Integer> filteredDoubleList = list.stream().map(doubleList).toList();

        filteredDoubleList.forEach(n-> System.out.println(n));
    }
}
