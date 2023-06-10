package org.exceptions.hw3.methods;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputData {
    public static void writeData(ContactData contactData) {

        FileWriter writer = null;
        String stringWrite = "<" + contactData.getSurName() + ">" +
                "<" + contactData.getName() + ">" +
                "<" + contactData.getFathersName() + ">" +
                "<" + contactData.getDateBirth() + ">" +
                "<" + contactData.getPhoneNo() + ">" +
                "<" + contactData.getSex() + ">";

        try {
            File file = new File("contact_data.txt");
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Файл создан: " + file.getAbsolutePath());
                } else {
                    System.out.println("Не удалось создать файл.");
                    return;
                }
            }

            writer = new FileWriter(file, true);
            writer.write(stringWrite);
            writer.write(System.lineSeparator());

            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}