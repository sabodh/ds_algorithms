package org.algorithms.devideandconquer;


public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search algorithms");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch(array, 8, 0, array.length - 1);
        if(index == -1) {
            System.out.println("Element not present");
        }else {
            System.out.println("Element index is : "+index);
        }
    }

    private static int binarySearch(int[] array, int searchNumber, int start, int end) {
        int middle = (start + end) / 2;
        int middleElement = array[middle];
        if(start > end){
            return  -1;
        }
        if (searchNumber == middleElement) {
            return middle;
        }
        if (searchNumber < middleElement) {
            return binarySearch(array, searchNumber, start, middle - 1);
        }else{
            return binarySearch(array, searchNumber, middle +1, end);
        }
    }
}
