package interface2;

import java.util.ArrayList;

public class InterfaceReview {
  public static void main(String[] args) {
    // 객체 생성
    Sounding d = new Dog();
    Sounding b = new Baby();
    Sounding t = new Tiger();
    Sounding r = new Robot();
    // 인터페이스 배열 생성
    ArrayList<Sounding> list = new ArrayList<Sounding>();
    list.add(d);
    list.add(b);
    list.add(t);
    list.add(r);

    // 소리내기
    for(int i=0; i<list.size(); i++) {
      list.get(i).sound();
    }
  }
}

/* 인터페이스 및 클래스를 작성하시오. */
interface Sounding {
  public void sound();
}

class Dog implements Sounding {
  public void sound() {
    System.out.println("Dog : 멍멍!");
  }
}
class Baby implements Sounding {
  public void sound() {
    System.out.println("Baby : 응애!");
  }
}
class Tiger implements Sounding {
  public void sound() {
    System.out.println("Tiger : 어흥!");
  }
}
class Robot implements Sounding {
  public void sound() {
    System.out.println("Robot : 삐빕!");
  }
}