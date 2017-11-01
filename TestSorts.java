import java.util.Arrays;

public class TestSorts{

  public static void main(String[] args){
    int[] someArray = {5,8,3,0,2,6,1,9,7,4};
    System.out.println(Arrays.toString(someArray));
    MergeSort.mergesort(someArray);
    System.out.println(Arrays.toString(someArray));

    int[] arr = {4,7,9,6,5,2,1};
    System.out.println(Arrays.toString(arr));
    QuickSort.quicksort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}
