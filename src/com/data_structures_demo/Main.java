package com.data_structures_demo;

public class Main {

    public static void main(String[] args) {
        int[] niz = new int[10];

        niz[0] = 20;
        niz[1] = 35;
        niz[2] = -15;
        niz[3] = 7;
        niz[4] = 55;
        niz[5] = 1;
        niz[6] = -22;
        niz[7] = 18;
        niz[8] = 30;
        niz[9] = 10;

        int[] selectionSortNiz = new int[niz.length];
        int[] insertSortNiz = new int[niz.length];
        int[] mergSortNiz = new int[niz.length];
        System.arraycopy(niz, 0, selectionSortNiz, 0, niz.length);
        System.arraycopy(niz, 0, insertSortNiz, 0, niz.length);
        System.arraycopy(niz, 0, mergSortNiz, 0, niz.length);

//        MyBubbleSort myBubbleSort = new MyBubbleSort();
//        System.out.println("Niz prije sortiranja ");
//        myBubbleSort.ispisiNiz(niz);


//        int[] sortirani_niz = myBubbleSort.mySort(niz);
//        System.out.println("Niz poslije sortiranja");
//        myBubbleSort.ispisiNiz(sortirani_niz);


//        MySelectionSort mySelectionSort = new MySelectionSort();
//        int[] mySelectionSort_sortirani = mySelectionSort.mySort(selectionSortNiz);
//        mySelectionSort.ispisiNiz(mySelectionSort_sortirani);

//        MyInsertionSort myInsertionSort = new MyInsertionSort();
//        int[] myInsertionSort_sortirani = myInsertionSort.mySort(insertSortNiz);
//        myInsertionSort.ispisiNiz(myInsertionSort_sortirani);


//        MyMergeSort myMergeSort = new MyMergeSort();
//        myMergeSort.mergeSort(mergSortNiz);
//        myMergeSort.ispisiNiz(mergSortNiz);
    }










}
