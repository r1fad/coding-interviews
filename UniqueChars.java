public class UniqueChars{

  public static boolean unique(String word){

    boolean[] char_set = new boolean[128];

    for (int i=0; i<word.length(); i++){
      int currentVal = word.charAt(i);
      if (char_set[currentVal])
        return false;
      char_set[currentVal]=true;
    }
    return true;
  }

  public static void main(String[] args){
    boolean isUnique = unique(args[0]);
    System.out.println(isUnique);
  }
}
