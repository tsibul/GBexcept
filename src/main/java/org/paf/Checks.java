package org.paf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.paf.Emploee.empoloyeeList;

public class Checks {

    public static ArrayList<String> namesJuniors(int age){
        ArrayList<String> names = new ArrayList<>();
        List<Map<String, String>> empList = empoloyeeList();
        for(Map<String, String> element: empList){
            if(Integer.parseInt(element.get("age")) < age){
                names.add(element.get("name"));
            }
        }
        return names;
    }

    public static Float averageAge(){
        Float average = 0F;
        List<Map<String, String>> empList = empoloyeeList();
        int i = 0;
        int age = 0;
        for(Map<String, String> element: empList){
            i++;
            age += Integer.parseInt(element.get("age"));
            }
        average = (float) age / i;
        return average;
    }

    public static ArrayList<String> namesWealthy (){
        ArrayList<String> names = new ArrayList<>();
        List<Map<String, String>> empList = empoloyeeList();
        for(Map<String, String> element: empList){
            if(!element.get("salary").replaceAll("[\\d\\s]", "").equals("руб")){
                names.add(element.get("name"));
            }
        }
        return names;
    }


}
