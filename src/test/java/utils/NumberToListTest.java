package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToListTest {
    @Test
    public void ShouldThrowExceptionWhenNumberIsO(){
        assertThrows(IllegalArgumentException.class, () -> NumberToList.convert(0));
    }

}