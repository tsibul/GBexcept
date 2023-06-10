package org.exceptions.hw3;

import org.exceptions.hw2.methods.Hw2_4;
import org.exceptions.hw3.methods.*;

import static org.exceptions.hw3.methods.InputData.inputData;

public class Hw3 {
    public static void main(String[] args) {
        ContactData contactData = new ContactData();
        Controller.inputController(contactData);
        OutputData.writeData(contactData);
    }
}