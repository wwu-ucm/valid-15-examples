package mergesort;



public class TestMergesort{
  
  public static void main(String[] args){
	    int[] sortedArray = {4,5,12,17,29,42,89,93};
	    int[] testArray = {89,5,93,12,29,4,42,17};
	    System.out.println(testSort(sortedArray,testArray));
    }
  
  public static boolean testSort(int[] sortedArray, int[] testArray  ){
    boolean result=true;
    MergeSort.sort(testArray);
    for (int i=0; i<testArray.length; i++)
      result = result && (sortedArray[i] == testArray[i]);
    return result;
  }
}

