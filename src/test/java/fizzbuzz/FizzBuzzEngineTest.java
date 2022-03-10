package fizzbuzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzEngineTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpOutput(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void cleanUpOutput() {
        System.setOut(null);
    }

    @Test
    void shouldThrowExceptionWhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(-1));
    }

    @Test
    void shoudPrint1ForNumber1() {
        FizzBuzzEngine.fizzBuzz(1);
        assertEquals("1=>1", outContent.toString());
    }

}