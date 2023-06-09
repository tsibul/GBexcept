package org.exceptions.hw1.methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hw1_1 {

    public static float logInt(int number){
        return (float) Math.log(number);
    }
    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        return dateformat.parse(date);
    }
    public static int indexElement(int[] array, int index){
        return array[index];
    }

}
