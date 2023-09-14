package Lambda.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest03 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //Function<Integer, Integer> doubleList = n -> n*2;

        List<Integer> filteredDoubleList = list.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        }).toList();

        filteredDoubleList.forEach(n-> System.out.println(n));
    }
}
