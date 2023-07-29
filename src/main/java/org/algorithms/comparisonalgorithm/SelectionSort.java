package org.algorithms.comparisonalgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Selection Sort algorithms");
        int[] array = {8, 2, 6, 5, 9, 3, 7, 1, 4};
        selectionSort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i =0; i< array.length -1; i++){
            int min = i;
            for(int j= i+1; j< array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

    }
}