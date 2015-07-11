package sqrt;

public class StdDev {
	 
  
  public static double stddev(double[] a) {
      int n = a.length;
      assert n > 0 : "empty input"; //precondition
      double sum = 0.0;
      double sumsqr = 0.0;
      for (int i = 0; i < n; i++) {
    	  sum += a[i];
    	  sumsqr += a[i]*a[i];
      }
      double mean = sum/n; 
      return Sqrt.sqrt(sumsqr/n - (mean*mean));
  }
  
 
}
