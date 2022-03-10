package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzConverterTest {
    @Test
    public void souldReuturnFizzWhenGiven3(){
        String result = FizzBuzzConverter.convert(3);
        assertEquals(result, "Fizz");
    }

    @Test
    public void souldReuturnBuzzWhenGiven5(){
        String result = FizzBuzzConverter.convert(5);
        assertEquals(result, "Buzz");
    }

    @Test
    public void shoulReturnFizzWhenGivenAMultipleOf3(){
        String result = FizzBuzzConverter.convert(9);
        assertEquals(result, "Fizz");
    }
}
