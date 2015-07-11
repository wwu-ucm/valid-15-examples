package sqrt;

public class Sqrt {
	 
  private static double eps = 0.000001;
  
  public static double sqrt(double r){ 
//	assert r >= 0.0 : "r must not be negative"; // precondition
	double a, a1 = 1.0;
	do {
      a = a1;
	   
      //a1 = (a+r/a)/2.0; // correct:
	  a1 = a+r/a/2.0; // erroneous!
	  assert a==1.0 || (a1>1.0 ? a1<a : a1>a): "no convergence";
	}
	while (Math.abs(a - a1) >= eps);
	//assert Math.abs(a1*a1 - r) < eps : "incorrect result"; //postcondition
	return a1;
  }
   
 
}
