package com.data_structures_demo;

public abstract class MySort {
    public abstract int[] mySort(int[] niz);

    //zamjenjuje mjesta elementima niza
    public static void zamijeniMjesta(int[] niz, int startPosition, int endPosition) {
        int temp = niz[startPosition];
        niz[startPosition] = niz[endPosition];
        niz[endPosition] = temp;
    }

    public void ispisiNiz(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + ", ");
        }
        System.out.println("");
    }

    public static boolean provjeri(int a, int b){
        if (a <= b) return false;
        else return true;
    }
}
