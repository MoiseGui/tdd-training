package utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberToListTest {
    @Test
    public void ShouldThrowExceptionWhenNumberIsO(){
        assertThrows(IllegalArgumentException.class, () -> NumberToList.convert(0));
    }

    @Test
    public void ShouldThrowExceptionWhenNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> NumberToList.convert(-1));
    }

    @Test
    public void ShouldReturnListFromOneToNumber(){
        assertEquals(NumberToList.convert(4), List.of(1,2, 3, 4));
    }

}