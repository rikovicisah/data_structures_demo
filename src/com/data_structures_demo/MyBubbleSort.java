package com.data_structures_demo;

public class MyBubbleSort {
    //Bubble sort
    public int[] mySort(int[] niz) {
        // i - pocetni sort index
        int b = niz.length; //adresa krajnjeg nesortiranog elementa
        int temp = 0;
        for (int j = 0; j < b + 1; j++) {
            for (int i = 0; i < b - 1; i++) {
                if (niz[i] > niz[i + 1]) {
                    temp = niz[i];
                    niz[i] = niz[i + 1];
                    niz[i + 1] = temp;
                }
            }
            b--;
        }
        return niz;
    }

    public void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + ", ");
        }
        System.out.println("");
    }
}
