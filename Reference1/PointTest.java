package Reference1;

public class PointTest {
  public static void main(String[] args) {
    // 객체 생성
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    
    // 거리 계산
    double dist = Point.distance(p1, p2);
    
    // 결과 출력
    System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
  }
}

class Point {
  /* 1. 필드를 만드시오. */
  int x;
  int y;
  /* 2. 생성자를 정의하시오. */
  Point(int x1, int y1) {
    x= x1;
    y= y1;
  }
  /* 3. 객체 정보를 문자열로 반환하는 인스턴스 메소드를 만드시오. */
  String toStr() {
    return String.format("(%d, %d)",x,y);
  }
  /* 4. 두 점 사이의 거리를 반환하는 클래스 메소드를 만드시오. */
  static double distance(Point p, Point q) {
    double dX= p.x-q.x;
    double dY=p.y-q.y;
    return Math.sqrt((dX*dX)+(dY*dY));
  }
}