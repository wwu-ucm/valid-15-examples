package binaryTree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestTree extends TestCase {

    public TestTree(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(TestTree.class);
    }

    public static void main(String[] args) {
    //    junit.textui.TestRunner.run(suite());
    	try {
			String string0 = insertAndFind((int[]) null, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void setUp() {
    }

    protected void tearDown() {
    }

    ;

    public void testIterator() throws Exception {
        BinTree<Integer, String> tree = new BinTree<Integer, String>();
        int testvalues[] = {42, 17, 39, 5, 89, 12};
        for (int i : testvalues)
            tree.insert(i, "s" + i);
        for (int i : testvalues)
            assertEquals("s" + i, tree.find(i));
    }
    
    public static String insertAndFind(int[] data,  int lookFor) throws Exception {
        BinTree<Integer,String> t = new BinTree<Integer,String>();
        if (data!=null)
           for (int i=0; i<data.length; i++)
                t.insert(data[i],("s" + i));

        return t.find(lookFor);
      }

}

