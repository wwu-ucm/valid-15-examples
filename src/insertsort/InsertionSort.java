package insertsort;

public class InsertionSort {
    
    private int[] x;

    
    public InsertionSort(int[] x) {
        assert x != null : "Constructor -> null";
        this.x = x;
    }
    
    public void insert(int n) {
        assert isSorted(n-1) : "insert precond 1";
        assert n <= x.length  : "insert precond 2";
        int i = n;
        while (i >= 1 && x[i-1] > x[i]) {
            int e = x[i-1];
            x[i-1] = x[i];
            x[i] = e;
           // i--; // Remove this
        }
        assert isSorted(n)  : "insert postcond"; 
    }
    
    public void insertSort() {
        for (int i = 1; i < x.length; i++) {
            insert(i);
        }
    }
    
    public boolean isSorted(int n) {
        for (int i = 1; i < n; i++) {
            if (x[i-1] > x[i]) return false;
        }
        return true;
    }
    

}
