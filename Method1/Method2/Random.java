//파라미터 값이 없는 메소드
package Method1.Method2;

public class Random {
  public static void main(String[] args) {
    // 메소드로부터 값을 반환
    int x = rollDie();
    
    // 결과 출력
    System.out.printf("주사위의 눈: %d", x);
  }
  
  // 1~6 사이의 임의의 정수를 반환
  public static int rollDie() {
    double r = 6 * Math.random(); // 0.00..~ 5.99..
    int temp = (int) r; // 0 ~ 5
    int n = temp + 1; // 1 ~ 6
    return n;
  }
}
