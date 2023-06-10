package org.exceptions.hw2.methods;

import java.util.Scanner;

public class Hw2_4 {
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    // Далее запросить повторный ввод строки
    public static void Hw2_4() {
        System.out.println("Enter string:");
        Scanner scanner = new Scanner(System.in);
        boolean notFinish = true;
        while (notFinish) {
            String inputLine = scanner.nextLine();
            if (!inputLine.equals("")) {
                System.out.println("You've entered: " + inputLine);
                notFinish = false;
            } else {
                System.out.println("Not blank string, try again: ");
            }
        }

    }
}
