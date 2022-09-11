package interface1;

public class VariousRoles {
  public static void main(String[] args) {
    // Person 객체 생성
    Person park = new Person("지현");

    // 각 직업으로 변신(업캐스팅)
    Developer dev = park;
    Instructor inst = park;
    Masseur mas = park;
    
    /* 3. 직업별 메소드를 호출하여 코드를 완성하세요. */
    dev.programming("java");
    inst.teach("자료구조");
    mas.massage();
  }
}

interface Developer {
  public void programming(String lang);
}

interface Instructor {
  public void teach(String subject);
}

interface Masseur {
  public void massage();
}

/* 1. 클래스에 개발자, 강사, 마사지사 역할을 부여하세요. */
class Person implements Developer, Instructor, Masseur {
  private String name;
  
  public Person(String name) {
    this.name = name;
  }

  /* 2. 구현하기로 한 인터페이스의 메소드를 오버라이딩 하세요.*/
  public void programming(String lang) {
    System.out.printf("%s -> %s 프로그래밍 중!\n",name,lang);
  }
  public void teach(String subject) {
    System.out.printf("%s -> %s 수업 중!\n",name, subject);
  }
  public void massage() {
    System.out.println("마사지 중");
  }
}