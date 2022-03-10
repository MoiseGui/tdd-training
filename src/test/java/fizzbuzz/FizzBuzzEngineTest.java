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

    @Test
    void shoudPrintCorrectOutputForNumber15() {
        String expected = "1=>1\n2=>2\n3=>Fizz\n4=>4\n5=>Buzz\n6=>Fizz\n7=>7\n8=>8\n9=>Fizz\n10=>Buzz\n11=>11\n12=>Fizz\n13=>13\n14=>14\n15=>FizzBuzz";
        FizzBuzzEngine.fizzBuzz(15);
        assertEquals(expected, outContent.toString());
    }

}