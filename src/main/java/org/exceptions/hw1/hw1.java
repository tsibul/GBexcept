package org.exceptions.hw1;

import java.text.ParseException;

import static org.exceptions.hw1.methods.hw1_1.*;
import static org.exceptions.hw1.methods.hw1_2.sum2d;
import static org.exceptions.hw1.methods.hw1_3.arrayDiv;

public class hw1 {
    public static void main(String[] args) throws ParseException {
        int number = 5;
        System.out.println(logInt(number));
        number = 0;
        System.out.println(logInt(number));
        System.out.println();
        String strDate = "2020-01-01";
        System.out.println(stringToDate(strDate));
//        strDate = "2020-01-";
//        System.out.println(stringToDate(strDate)); кидает исключение
        int[] array = {5, 8, 9};
        System.out.println(indexElement(array, 2));
//        System.out.println(indexElement(array,4)); кидает исключение

        String[][] strArray = {
                {"1", "256", "352", "987", "1666", "188"},
                {"10", "2560", "3520", "9870", "16660", "1088"},
                {"19", "2586", "3452", "9847", "166", "1388"},
        };
        System.out.println(sum2d(strArray));
        strArray = new String[][]{
                {"256", "352", "987", "1666"},
                {"2560", "3520", "9870", "16660"},
                {"2586", "3452", "9847", "166"},
        };
//        System.out.println(sum2d(strArray)); //.ArrayIndexOutOfBoundsException
        strArray = new String[][]{
                {"256", "fff", "987", "1666", "188"},
                {"2560", "3520", "hhh", "16660", "1088"},
                {"2586", "3452", "9847", "166", "1388"},
        };
//        System.out.println(sum2d(strArray)); //.NumberFormatException
        int[] arr1= {15, 18, 29, 912, 366};
        int[] arr2= {7, 11, 99, 36};
        double[] res =arrayDiv(arr1, arr2);
        for (int i = 0; i < res.length; i++) System.out.print(res[i] + ", ");

    }
}