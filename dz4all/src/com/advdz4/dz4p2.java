package com.advdz4;

import java.util.Arrays;

public class dz4p2 {
    public static void main(String[] args) {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        counter = counter + 1;
                        break;
                    }
                }
            }
            System.out.println("Простых чисел в массиве: " + (array.length - counter));

    }
}
