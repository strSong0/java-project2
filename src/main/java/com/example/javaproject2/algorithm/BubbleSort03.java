package com.example.javaproject2.algorithm;

public class BubbleSort03 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        int i = 0;

        for (int j = 0; j < arr.length-1; j++) {
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
    }
}
