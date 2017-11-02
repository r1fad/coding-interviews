public class Fibonacci{

  public static int fibonacci(int i){
    if (i == 0) return 0;
    if (i == 1) return 1;

    return fibonacci(i-1)+fibonacci(i-2);
  }

  public static int fibonacciDyno(int n){
    return fibonacciDyno(n, new int[n+1]);
  }

  public static int fibonacciDyno(int i, int[] memo){
    if (i==1 || i==0) return i;
    if (memo[i] == 0)
      memo[i] = fibonacciDyno(i-1, memo) + fibonacciDyno(i-2, memo);
    return memo[i];
  }

  public static void main(String[] args){
    System.out.println(fibonacciDyno(Integer.parseInt(args[0])));
  }
}
