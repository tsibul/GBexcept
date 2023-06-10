package org.exceptions.hw2.methods;

public class Hw2_2 {
    public static void Hw2_2(int[] intArray, int d) {
        if(intArray.length > 8) {
            if(d != 0){
                double catchedRes1 = (double) intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else  {
                System.out.println("на 0 делить нельзя");
            }
        }
        else {
            System.out.println("в массиве недостаточно элементов");
        }
    }

}
