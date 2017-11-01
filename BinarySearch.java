public class BinarySearch{

  //assume array is sorted
  public static int search(int item, int[] arr){
    int low = 0;
    int high = arr.length - 1;

    while (low <= high){
      int mid = (low + high)/2;
      System.out.println(low+" "+mid+" "+high);
      if      (item < arr[mid]) high = mid - 1;
      else if (item > arr[mid]) low = mid + 1;
      else return mid;
    }
    return -1;
  }
}
