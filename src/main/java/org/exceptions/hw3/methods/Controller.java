package org.exceptions.hw3.methods;

import static org.exceptions.hw3.methods.InputData.inputData;

public class Controller {
    public static void inputController(ContactData contactData){
        boolean inCorrectInput = true;
        while (inCorrectInput) {
            String[] inputData = inputData();
            if(CheckInputLength.checkInputLength(inputData) == 0){
                ParseInput.parseInputToContactData(inputData, contactData);
            }
            if(contactData.checkFieldsForNull()) inCorrectInput = false;
        }
    }
}
