package org.example;

import static org.example.CreateHonestArray.createHonestArray;
import static org.example.InsertionSort.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 7, 8, 9, 11, 12, 15};
        int[] randomNumbers ={25, 78, 54, 99, 1, 1, 25};

        int[] sortedArray = sortArray(randomNumbers);

        // Вивід результату
        for (int number : sortedArray) {
            System.out.println(number);
        }
    }
}
