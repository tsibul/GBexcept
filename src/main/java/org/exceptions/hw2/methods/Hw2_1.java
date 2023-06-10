package org.exceptions.hw2.methods;

import java.util.Scanner;

public class Hw2_1 {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void Hw2_1() {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        boolean notFinish = true;
        while (notFinish) {
            String inputLine = scanner.nextLine();
            if (inputLine.matches("^-?\\d+(?:\\.\\d+)?$")) {
                System.out.println("You've entered: " + inputLine);
                notFinish = false;
            } else {
                System.out.println("Wrong format, try again");
            }
        }
        scanner.close();

    }
}
