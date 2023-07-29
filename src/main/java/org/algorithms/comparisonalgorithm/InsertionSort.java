package org.algorithms.comparisonalgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort algorithms");
        int[] array = {8, 2, 6, 5, 9, 3, 7, 1, 4};
        insertionSort(array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i< array.length; i++){
            int selected = array[i];
            int j= i-1;
            while(j >=0 && array[j] > selected){
                if(array[j] > array[j +1]){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = selected;
            }
        }
    }
}