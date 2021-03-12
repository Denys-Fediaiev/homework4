package com.advdz4;
import java.util.Arrays;
public class dz4p3 {

        public static void main(String[] args) {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            int composite = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        composite = composite + 1;
                        break;
                    }
                }
            }
            System.out.println("составных чисел в массиве: " + composite);

        }
}
