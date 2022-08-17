package Conditional1;

public class Beer {
  public static void main(String[] args) {
    order(18); // 18세가 캔맥주를 사려 함
    order(19); // 19세..
    order(20); // 20세..
  }

  public static void order(int age) {
    if (age >= 19) {
      System.out.printf("%d세, 성인인증 완료 => 캔맥주가 나왔습니다.\n", age);
    }
  }
}