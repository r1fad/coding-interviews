public class MergeSort{

  public static void mergesort(int[] anArray) {

		int size = anArray.length;

    // base case
		if(size < 2)
			return;

    // find middle of array
		int mid = anArray.length / 2;

    // create new array and copy left elements into it
		int[] leftArray = new int[mid];
		for(int i=0; i<mid; i++) {
			leftArray[i] = anArray[i];
		}

    // create new array and copy right half elements into it
		int[] rightArray = new int[size - mid];
		for(int i=mid;i<size;i++) {
			rightArray[i-mid] = anArray[i];
		}

    // recursively split the left half
		mergesort(leftArray);

    // recursively split the right half
		mergesort(rightArray);

    // sort and merge 2 halves back together
		merge(leftArray, rightArray, anArray);
	}

	public static void merge(int[] left, int[] right, int[] resultArray) {
		int leftSize = left.length;
		int rightSize = right.length;

		int i=0, j=0, k=0;

		while (i<leftSize && j<rightSize) {
      // copy all smaller elements into resultant array
			if (left[i] <= right[j]) {
				resultArray[k] = left[i];
				i++;
				k++;
			}

      // then copy all the bigger elements
			else {
				resultArray[k] = right[j];
				j++;
				k++;
			}
		}

    // copy any remaining elements from left half into resultant
		while(i<leftSize) {
			resultArray[k] = left[i];
			i++;
			k++;
		}

    // copy any remaining elements from right half into resultant
		while(j<rightSize) {
			resultArray[k] = right[j];
			j++;
			k++;
		}

	}
}
