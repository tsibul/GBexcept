package org.exceptions.hw3.methods;

import java.lang.reflect.Field;

public class ContactData {
    private String surName;
    private String name;
    private String fathersName;
    private String phoneNo;
    private String dateBirth;
    private String sex;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean checkFieldsForNull() {
        Field[] fields = this.getClass().getDeclaredFields();
        int i = 0;
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.get(this) == null) {
                    System.out.println(getDisplayName(field.getName()) + " не введено");
                    i++;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return i == 0;
    }

    private String getDisplayName(String fieldName) {
        return switch (fieldName) {
            case "surName" -> "Фамилия";
            case "name" -> "Имя";
            case "fathersName" -> "Отчество";
            case "phoneNo" -> "Телефон";
            case "dateBirth" -> "Дата рождения";
            case "sex" -> "Пол";
            default -> fieldName;
        };
    }
}