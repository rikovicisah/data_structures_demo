package com.data_structures_demo;

public class MySelectionSort extends MySort {

    public int[] mySort(int[] niz) {
        int index = 0;
        for (int sortiranaPozicija = 0; sortiranaPozicija < niz.length; sortiranaPozicija++) {
            index = nadjiNajmanji(niz, sortiranaPozicija, niz.length);
            zamijeniMjesta(niz, index, sortiranaPozicija);
        }
        return niz;
    }

    //nalazi najmanji element u nizu i vraca index
    private static int nadjiNajmanji(int[] niz, int start, int end) {
        int indexNajmanji = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = start; i < end; i++) {
            if (temp > niz[i]) {
                temp = niz[i];
                indexNajmanji = i;
            }
        }
        return indexNajmanji;
    }
}
