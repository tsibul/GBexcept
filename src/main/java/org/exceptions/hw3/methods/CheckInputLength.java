package org.exceptions.hw3.methods;

public class CheckInputLength {
    public static int checkInputLength(String[] inputString) {
        int errorCode = 0;
        if (inputString.length > 6) {
            errorCode = 1;
            System.out.println("Количество введенных данных превышает необходимое (" + inputString.length + " вместо 6");
            System.out.println("Попробуйте еще раз");
        } else if (inputString.length < 6) {
            errorCode = -1;
            System.out.println("Количество введенных данных меньше необходимого (" + inputString.length + " вместо 6");
            System.out.println("Попробуйте еще раз");
        }
        return errorCode;
    }
}

