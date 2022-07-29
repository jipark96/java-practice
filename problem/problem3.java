public class problem3 {
  static int getDigitCount(int n) {
    String s ="" +n; //문자열로 바꾸기
    return s.length();
  }
  public static void main(String[] args) {
    System.out.println(getDigitCount(9));
    System.out.println(getDigitCount(18));
    System.out.println(getDigitCount(666));
    System.out.println(getDigitCount(12222));
    System.out.println(getDigitCount(5555));
    }
  }

