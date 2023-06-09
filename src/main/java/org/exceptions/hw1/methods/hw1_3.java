package org.exceptions.hw1.methods;

public class hw1_3 {
    public static double[] arrayDiv(int[] arr1, int[] arr2){
        double [] resArray = new double[arr1.length];
        int len = Math.max(arr1.length, arr2.length);
        for(int i = 0; i < len; i++){
            try{
                resArray[i] = (double) arr1[i] / arr2 [i];
            } catch (Exception e){
                System.out.println("что-то поломалось");
            }
        }
        return resArray;
    }
}
