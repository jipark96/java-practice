package api1;

// 자바 API를 불러옴
import java.lang.Math;
import java.util.Random;

public class RandomTest {
  public static void main(String[] args) {
    // 변수 생성 및 주사위 던지기
    // int a = DieA.roll();
    // int b = DieB.roll();
    
    //배열생성
    int[] counts = new int[13];

    // 변수 생성 및 주사위 100번 던지기
    for (int i=0; i<100; i++) {
      int a = DieA.roll();
      int b = DieB.roll();
      counts[a+b]++;
    }
    // 결과 출력
    // System.out.printf("A: %d\n", a);
    // System.out.printf("B: %d\n", b);
    for (int row=2; row<counts.length; row++) {
      System.out.printf("%d => ",row);
      //#출력
      for(int col =0; col<counts[row]; col++) {
        System.out.printf("#");
      }
      System.out.println();
    }
  }
}

class DieA {
  // 1 부터 6사이 정수를 반환
  public static int roll() {
    double r = Math.random() * 6; // 0.0 <= r < 6.0
    int randInt = (int) r;        // 0, 1, 2, ..., 5
    return randInt + 1;           // 1, 2, 3, ..., 6
  }
}

class DieB {
  public static int roll() {
    // 1 부터 6사이 정수를 반환 
    Random rand = new Random();
    int randInt = rand.nextInt(6); // (0 ~ 5)
    return randInt + 1;
  }
}