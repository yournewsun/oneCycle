package org.example;

public class CreateHonestArray {
    public static int[] createHonestArray(int[] numbers) {

        int[] finalArray = new int[0];

        for (int number : numbers) {
            if (number % 2 == 0) {
                finalArray = append(finalArray,number);
                /* */
            }
        }

        return finalArray;
    }
    public static int[] append(int[] array, int tail) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = tail;
        return result;
    }
}
