package org.paf;

import java.util.*;

public class Emploee {

    public static List<Map<String, String>> empoloyeeList() {
        List<Map<String, String>> empoloeeList = new ArrayList<>();

        empoloeeList.add(createEmployee("Кирилл", "26", "Middle java dev", "150000 руб"));
        empoloeeList.add(createEmployee("Виталий", "28", "Senior java automation QA", "2000$"));
        empoloeeList.add(createEmployee("Александр", "31", "junior functional tester", "50000 руб"));
        empoloeeList.add(createEmployee("Дементий", "35", "dev-ops", "1500$"));

        return empoloeeList;
    }

    private static Map<String, String> createEmployee(String name, String age, String position, String salary) {
        Map<String, String> employee = new HashMap<>();
        employee.put("name", name);
        employee.put("age", age);
        employee.put("position", position);
        employee.put("salary", salary);
        return employee;
    }


}