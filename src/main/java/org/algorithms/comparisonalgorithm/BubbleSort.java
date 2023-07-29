package org.algorithms.comparisonalgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort algorithms");
        int[] array = {8, 2, 6, 5, 9, 3, 7, 1, 4};

        bubbleSort(array);

        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i =0;i < array.length - 1; i++){
            for(int j =0;j < array.length - i -1; j++){
                if(array[j] > array[j + 1]){
                    int temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
    }


}