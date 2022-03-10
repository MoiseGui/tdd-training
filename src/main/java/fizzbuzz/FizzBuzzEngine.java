package fizzbuzz;

import utils.NumberToList;

import java.util.List;

public class FizzBuzzEngine {

    private FizzBuzzEngine() {
    }

    public static void fizzBuzz(int i) {
        List<Integer> list = NumberToList.convert(i);

        String result = "";
        for (Integer integer : list) {
            result += integer + "=>" + FizzBuzzConverter.convert(integer);
        }

        System.out.print(result);
    }
}
