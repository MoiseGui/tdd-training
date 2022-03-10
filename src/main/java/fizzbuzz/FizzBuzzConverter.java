package fizzbuzz;

public class FizzBuzzConverter {
    public static String convert(int i) {
        if(i % 3 == 0) return "Fizz";
        return "Buzz";
    }
}
