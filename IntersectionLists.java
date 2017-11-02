import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class IntersectionLists{

  public static ArrayList<Integer> findIntersect(int[] arr1, int[] arr2){

    ArrayList<Integer> intersect = new ArrayList<Integer>();

    // create hash set and copy elements from second
    // to hash set
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (int i=0; i<arr2.length; i++)
      set2.add(arr2[i]);

    // run through first array and check if
    // hash set contains elements, if yes add to intersectArray
    for (int i=0; i<arr1.length; i++){
      if(set2.contains(arr1[i]))
        intersect.add(arr1[i]);
    }

     return intersect;

  }

  public static void main(String[] args){
    int[] someArray = {5,8,3,0,2,6,9,7,4};
    int[] anotherArray = {4,8,3,6,0,2,1};
    ArrayList<Integer> resultArray = findIntersect(someArray, anotherArray);
    System.out.println(resultArray);
  }
}
