package org.exceptions.hw3.methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParseInput {
    public static void parseInputToContactData(String[] inputData, ContactData contactData) {
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (ifSex(inputData[i])) contactData.setSex(inputData[i]);
            else if (ifPhone(inputData[i])) contactData.setPhoneNo(inputData[i]);
            else if (ifCouldBeDateBirth(inputData[i])) {
                if (ifCorrectDate(inputData[i])) contactData.setDateBirth(inputData[i]);
            } else if (ifName(inputData[i])) {
                j++;
                if (j % 3 == 1) contactData.setSurName(inputData[i]);
                else if (j % 3 == 2) contactData.setName(inputData[i]);
                else contactData.setFathersName(inputData[i]);
            }
        }
    }

    public static boolean ifSex(String input) {
        return input.equals("f") || input.equals("m");
    }

    public static boolean ifPhone(String input) {
        return input.matches("\\d{11}");
    }

    public static boolean ifCouldBeDateBirth(String input) {
        return input.matches("^\\d{2}\\.\\d{2}\\.\\d{4}$");
    }

    public static boolean ifCorrectDate(String input) {
        String formatPattern = "dd.MM.yyyy";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(formatPattern);
        try {
            LocalDate date = LocalDate.parse(input, dateFormatter);
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Дата не является действительной.");
            return false;
        }
    }

    public static boolean ifName(String input) {
        if(!input.matches("^[А-ЯЁ][а-яё]*$")){
            System.out.println("Неправильно введено ФИО");
            return false;
        }
        return true;
    }
}
