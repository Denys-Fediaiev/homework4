package com.advdz4;

import java.util.Arrays;

public class dz4 {
    private static double getAverage(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average/array.length;

    }
    public static void main(String[] args) {
        int array [] = new int[400] ;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random()*400));
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Среднее арифметическое: " + getAverage(array));
    }
}
