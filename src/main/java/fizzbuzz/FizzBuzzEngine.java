package fizzbuzz;

import utils.NumberToList;

import java.util.List;

public class FizzBuzzEngine {

    private FizzBuzzEngine() {
    }

    public static void fizzBuzz(int i) {
        List<Integer> list = NumberToList.convert(i);
    }
}
