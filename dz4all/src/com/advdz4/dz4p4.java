package com.advdz4;

import java.util.Arrays;

public class dz4p4 {
    public static void main(String[] args) {
        int array[] = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                temp = array[i];
                array[i] = 0;
            }
        } System.out.println(Arrays.toString(array));
    }
}
