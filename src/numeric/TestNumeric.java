package numeric;

import junit.framework.*;

public class TestNumeric extends TestCase{
  
  public TestNumeric(String name){super(name);}
  
  public static Test suite(){
    return new TestSuite(TestNumeric.class);}
  
  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());}
  
  public void testFoo(){
	assertEquals(Numeric.foo(2, 1),1);
  }
 
  // rafa: added
  public static int testFoo(int a, int b){
    return Numeric.foo(a, b);
  }

}

