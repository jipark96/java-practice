package Class1;

public class SquareTest {
  public static void main(String[] args) {
    /* 객체 생성 */
    Square s1 = new Square();
    /* 필드 초기화(값 변경) */
    s1.length = 4;
    /* 결과 출력 */
    System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d",s1.length,s1.area());
  }
}

/* 정사각형 클래스 구현 */
class Square {
  int length;
  
  // void area() {
  //   System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d",length,length*length);
  // }
  int area() {
    return length * length;
  }
}