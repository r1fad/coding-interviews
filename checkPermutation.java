import java.util.Arrays;

public class checkPermutation{

  public static boolean isPermutation(String str1, String str2){

     char[] charArray1 = str1.toCharArray();
     char[] charArray2 = str2.toCharArray();

     Arrays.sort(charArray1);
     Arrays.sort(charArray2);

     String newStr1 = new String(charArray1);
     String newStr2 = new String(charArray2);

     if (newStr1.equals(newStr2))
      return true;
     else
      return false;

  }

  public static void main(String[] args){
    System.out.println(isPermutation(args[0],args[1]));
  }

}
