package utils;

import java.util.List;

public class NumberToList {

    public static List<Integer> convert(int i) throws IllegalArgumentException{
        if(i <= 0) {
            throw new IllegalArgumentException("0 is not a valid number");
        }


        List<Integer> list = new java.util.ArrayList<>();
        for(int j = 1; j <= i; j++) {
            list.add(j);
        }
        return list;
    }
}
