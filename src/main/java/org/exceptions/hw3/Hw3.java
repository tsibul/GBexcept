package org.exceptions.hw3;

import org.exceptions.hw3.methods.*;

public class Hw3 {
    public static void main(String[] args) {
        ContactData contactData = new ContactData();
        Controller.inputController(contactData);
        OutputData.writeData(contactData);
    }
}