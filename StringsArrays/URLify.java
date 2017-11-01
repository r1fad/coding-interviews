public class URLify{

  public static String replaceSpaces(String word){
    String newWord = word.replace(" ","%20");
    return newWord;
  }

  public static void main(String[] args){
    String givenWord = "Mr Rifad Lafir";
    System.out.println(replaceSpaces(givenWord));

  }

}
