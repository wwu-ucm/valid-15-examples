package numeric;

public class Numeric {
  
  public static int foo(int x, int y){
	int result = 0;
	assert x>=0 && y>= 0 : "illegal arguments";
	if (y < x)
		if (y < 4-x)
			if (y > 0)
			  result= -1; 
	assert result>=0: "bad result" ;
	return result;
  }
}
