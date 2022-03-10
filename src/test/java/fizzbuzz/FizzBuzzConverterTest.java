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

    @Test
    public void shoulReturnFizzBuzzWhenGiven15(){
        String result = FizzBuzzConverter.convert(15);
        assertEquals(result, "FizzBuzz");
    }


    @Test
    public void shoulReturnFizzBuzzWhenGivenAMultipleOf15(){
        String result = FizzBuzzConverter.convert(30);
        assertEquals(result, "FizzBuzz");
    }

    @Test
    public void shoulReturnTheNumberIfNotMultipleOf3Or5Or15(){
        String result = FizzBuzzConverter.convert(8);
        assertEquals(result, "8");
    }

    @Test
    public void shoulReturnBuzzWhenGivenAMultipleOf5(){
        String result = FizzBuzzConverter.convert(10);
        assertEquals(result, "Buzz");
    }
}
