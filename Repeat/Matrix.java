package Repeat;
import java.util.Scanner;
public class Matrix {
  public static void main(String[] args) {
    // 입력값 받기
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int c = sc.nextInt();
    // 매트릭스 출력
    printMatrix(r, c);
  }
  
  public static void printMatrix(int rowMax, int columnMax) {
    for (int i = 0; i < rowMax; i++) {
      for (int j = 0; j < columnMax; j++) {
        System.out.printf("* ");
      }
      System.out.println();
    }
  }
}