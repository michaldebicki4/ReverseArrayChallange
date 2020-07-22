package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }
    public static void reverse(int[] array){
        int temp = 0;
        int[] reversedArray = new int[array.length];
        for (int i = 0; i<array.length ; i++){
            temp = array[i];
            reversedArray[reversedArray.length -1 - i] = temp;

        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
