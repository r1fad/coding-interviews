public class UniqueString{

  public static boolean checkUnique(String word){
    String str = word;

    boolean[] uniqueArray = new boolean[128];

    for (int i=0; i<str.length(); i++){
      int val = str.charAt(i);

      if(uniqueArray[val])
        return false;

      uniqueArray[val] = true;
    }
    return true;
  }

  public static void main(String[] args){

      System.out.println(checkUnique(args[0]));

  }


}
