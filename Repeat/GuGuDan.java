package Repeat;

public class GuGuDan {
  public static void main(String[] args) {
    printGuGuDan(2);
  }

  public static void printGuGuDan(int dan) {
    System.out.println(dan+"단");
    for (int j=1; j<=9; j++) {
      System.out.printf("\t"); // 들여쓰기
      System.out.println(dan+ " x " +j+ " = "+dan*j);
    }
  }
}
