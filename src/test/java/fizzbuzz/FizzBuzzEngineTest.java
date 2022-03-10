package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzEngineTest {
    @Test
    void shouldThrowExceptionWhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(-1));
    }

}