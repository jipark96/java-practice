package problem;
public class problem7 {
  static int fib(int n) {
    if(n==0) {
      return 0;
    } else if(n==1) {
      return 1;
    } else {
      return fib(n-2)+fib(n-1);
    }
  }
  public static void main(String[] args) {
    for (int i=0; i<10; i++) {
      System.out.println(fib(i));
    }
  }
  
}
