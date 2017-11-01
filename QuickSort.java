public class QuickSort{

  public static void quicksort(int[] arr, int low, int high){
    if (arr == null || arr.length == 9)
      return;

    if (low >= high)
      return;

    //select a pivot
    int middle = low + (high - low)/2;
    int pivot = arr[middle];

    int i=low, j=high;
    while (i<=j){
      // find element in the left half that is greater than pivot
      while (arr[i] < pivot)
        i++;

      // find element in the right half that is less than pivot
      while (arr[j] > pivot)
        j--;

      // swap elements
      if (i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    // recursively sort two sub parts
    if (low < j)
      quicksort(arr, low, j);

    if (high > i)
      quicksort(arr, i, high);

  }
}
