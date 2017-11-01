import java.util.Arrays;

public class TestSearch{

  public static void main(String[] args){
    int[] someArray = {5,8,3,0,2,6,1,9,7,4};
    MergeSort.mergesort(someArray);
    System.out.println(Arrays.toString(someArray));
    int index = BinarySearch.search(7,someArray);
    System.out.println("Found at index: " + index);
  }
}
