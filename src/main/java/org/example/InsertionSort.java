package org.example;

public class InsertionSort {

    public static int[] sortArray(int[] randomArray){
        int [] sortedArray = new int [0];
        int number;
        int elementAddress;

        for (int j : randomArray) { //прохід по несортованому масиву від початку
            number = j;
            elementAddress = findingPlaceInSortedArray(sortedArray, number);
            sortedArray = intercalation(sortedArray, elementAddress, number);
        }

        return sortedArray;
    }


    //findingPlaceInSortedArray повертає адресу у яку треба вставити "number" щоб масив відповідав статусу відсортований

    public static int findingPlaceInSortedArray(int[] array, int number){
        int resultIndex = array.length;
        for (int index = 0; index < array.length; index++){
            if (number < array[index]){
                resultIndex = index;
                break;
            }
        }

        return resultIndex;
    }

    
    //intercalation додає елемент "number" в середину масиву за адресою "index" і повертає новий масив

    public static int[] intercalation (int[] array, int index, int number){
        int[] resultArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }

        resultArray[index] = number;

        for (int i = index + 1; i < resultArray.length; i++) {
            resultArray[i] = array[i - 1];
        }


        return resultArray;
    }
}
