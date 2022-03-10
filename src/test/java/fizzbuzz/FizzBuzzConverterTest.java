package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzConverterTest {
    @Test
    public void souldReuturnFizzWhenGiven3(){
        String result = FizzBuzzConverter.convert(3);
        assertEquals(result, "Fizz");
    }
}
