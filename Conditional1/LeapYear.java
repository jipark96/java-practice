package Conditional1;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    /* 1. 입력값 받기 */
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    /* 2. 윤년 여부 계산 */
    boolean b = isLeapYear(a); 

    /* 4. 결과 출력 */
    System.out.println(a+"년은 윤년입니까? " +b);
  } 
  /* 3. 윤년 여부를 반환하는 메소드 */
  public static boolean isLeapYear(int year) {
    boolean result = false;

    if(year % 4 == 0) {
      result = true;

      if(year % 100 ==0) {
        result = false;

        if(year % 1000 == 0) {
          result = true;
        }
      }
    }

    return result;
  }
}
