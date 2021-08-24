package com.data_structures_demo;

public class MyMergeSort{
    public void mergeSort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length - 1);
    }

    private void mergesort(int[] array, int[] temp, int start, int end) {
        if (start >= end) return;
        int middle = (start + end) / 2;
        mergesort(array, temp, 0, middle);
        mergesort(array, temp, middle + 1, end);
        mergeArray(array, temp, start, end);
    }

    private  void mergeArray(int[] array, int[] temp, int start, int end) {
        int leftEnd = (start + end)/2;
        int rightStart = leftEnd + 1;
        int size = end - start + 1;

        int leftIndex = start;
        int rightIndex = rightStart;
        int indexTempArray = start;

        while (leftIndex <= leftEnd && rightIndex <= end){
            if (array[leftIndex] <= array[rightIndex]){
                temp[indexTempArray] = array[leftIndex];
                leftIndex++;
            }
            else{
                temp[indexTempArray] = array[rightIndex];
                rightIndex++;
            }
            indexTempArray++;
        }
        System.arraycopy(array, leftIndex, temp, indexTempArray, leftEnd - leftIndex + 1);
        System.arraycopy(array, rightIndex, temp, indexTempArray, end - rightIndex + 1);
        System.arraycopy(temp, start, array, start, size);
    }

    public void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + ", ");
        }
        System.out.println("");
    }
}
