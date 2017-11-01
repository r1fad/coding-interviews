import java.util.Arrays;

public class CheckPermutation{

  public static boolean isPermutation(String str1, String str2){

     if (str1.length() != str2.length()) return false;

     int[] letters = new int[128];
     for (int i=0; i<str1.length(); i++)
       letters[str1.charAt(i)]++;

     for (int j=0; j<str2.length(); j++){
       letters[str2.charAt(j)]--;
       if (letters[str2.charAt(j)] < 0)
        return false;
     }

     return true;
  }

  public static void main(String[] args){
    System.out.println(isPermutation(args[0],args[1]));
  }

}
