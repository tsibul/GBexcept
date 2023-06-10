package org.exceptions.hw3.methods;

import java.util.Scanner;

public class InputData {
    public static String[] inputData(){
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("Введите ФИО, дату рождения, телефон и пол через пробел");
        System.out.println("формат телефона - только цифры");
        System.out.println("формат даты - dd.mm.YYYY");
        System.out.println("формат пола - f или m :");
        return scanner.nextLine().split(" ");
    }
}
