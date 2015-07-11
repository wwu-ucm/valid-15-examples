package insertsort;

import insertsort.InsertionSort;

public class Check {
    
      
    public static void check(int []x) {        
        InsertionSort is = new InsertionSort(x);
        is.insertSort();
    }

/*
    public static void main(String[] args) {
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      intArray0[2] = 70;
      check(intArray0);     
    } */
}
