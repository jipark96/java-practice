package Reference1;

public class CircleTes {
  public static void main(String[] args) {
    Circle c1 = new Circle(0,0,3); // 중심(0,0) - 반지름3
    Circle c2 = new Circle(2, 3, 4); // 중심(2,3) - 반지름4

    double area1 = Circle.area(c1);
    double area2 = Circle.area(c2);

    System.out.printf("%s => 넓이: %.2f\n", c1.toStr(), area1);
    System.out.printf("%s => 넓이: %.2f\n", c2.toStr(), area2);

  }
}

class Circle {
  //필드
  int x;
  int y;
  int r;

  //생성자
  Circle(int centerX, int centerY, int radius) {
    x= centerX;
    y=centerY;
    r=radius;
  }

  //인스턴스 메소드
  String toStr() {
    return String.format("Circle { 중심 : (%d, %d), 반지름 : %d }",x,y,r);
  }
  //클래스 메소드
  static double area(Circle c) {
    return Math.PI *c.r*c.r;
  }
}
