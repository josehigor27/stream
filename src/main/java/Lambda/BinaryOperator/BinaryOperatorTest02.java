package Lambda.BinaryOperator;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        //BinaryOperator<Integer> sum = (n1,n2) -> n1+n2;

        int result = list.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1+n2;
            }
        });
        System.out.println(result);
    }
}
