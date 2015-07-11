package mergesort;

public class MergeSort {

    public static void merge(int[] a, int l1, int r1,
                             int[] b, int l2, int r2,
                             int[] c, int l3) {
        assert sorted(a, l1, r1) : "1st argument of merge not sorted from " + l1 + " to " + r1;
        assert sorted(b, l2, r2) : "2nd argument of merge not sorted from " + l2 + " to " + r2;
        int l = l3;
        while (l1 < r1 && l2 < r2)
            c[l3++] = (a[l1] < b[l2]) ? a[l1++] : b[l2++];
        while (l1 < r1) c[l3++] = a[l1++];
        while (l2 < r2) c[l3++] = b[l2++]; 
        assert sorted(c, l, l3) : "result of merge not sorted";
    }

    public static void distribute(int[] a, int[] b, int[] c, int l) {
        int i = 0;
        for (int j = 0; j < a.length; j += 2 * l) {
            for (int k = j / 2; k < j / 2 + l; k++) b[k] = a[i++];
            for (int k = j / 2; k < j / 2 + l; k++) c[k] = a[i++];
        }
    }

    public static void sort(int[] a) {
        assert is_power2(a.length) : "no power of 2"; // a.length must be power of 2
        int[] b = new int[a.length / 2];
        int[] c = new int[a.length / 2];
        for (int size = 1; size < a.length; size *= 2) {
            distribute(a, b, c, size);
            for (int i = 0; i < a.length / 2; i += size)
                merge(b, i, i + size, c, i, i + size-1 /*Error: the -1 should be removed*/, a, 2 * i);
        }
        assert sorted(a, 0, a.length - 1) : "result not sorted";
    }

    private static boolean sorted(int[] a, int j, int k) {
        for (int i = j; i < k - 1; i++)
            if (a[i] > a[i + 1]) return false;
        return true;
    }

    private static boolean is_power2(int n) {
        if (n == 1) return true;
        else if (n % 2 == 1) return false;
        else return is_power2(n / 2);
    }
    

}
