package Lambdapractice;

import java.util.function.BinaryOperator;
// interface Calculator{
//   int sum(int a, int b);
// }

// public class Sample {
//   public static void main(String[] args) {
//     Calculator mc = Integer::sum;
//     int result = mc.sum(3,4);
//     System.out.println(result);
//   }
// }

public class Sample {
  public static void main(String[] args) {
    BinaryOperator<Integer> mc = (a,b)-> a+b;
    int result = mc.apply(3,4); // sum이 아닌 apply 메서드 사용
    System.out.println(result);
  }
}
