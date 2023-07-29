package org.algorithms.devideandconquer;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge Sort algorithms");
        int[] array = {8, 2, 6, 5, 9, 3, 7, 1, 4};
       mergeSort(array);

        System.out.println("Sorted");
        for(int value: array){
            System.out.println(value);
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length < 2) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray= new int[length - middle];
        int i = 0;
        int j = 0;
        for(; i < length;i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftLength = leftArray.length ;
        int rightLength = rightArray.length;
        int i = 0, left =0, right = 0;
        while (left < leftLength && right < rightLength){
            if(leftArray[left] < rightArray[right]){
                array[i] = leftArray[left];
                left ++;
            }else {
                array[i] = rightArray[right];
                right ++;
            }
            i++;
        }
        while (left < leftLength){
            array[i] = leftArray[left];
            left ++;
        }
        while (right < rightLength){
            array[i] = rightArray[right];
            right ++;
        }
    }
}
