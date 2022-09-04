package scope1;

public class KnightTest {
  public static void main(String[] args) {
    // 객체 생성
    Knight knight = new Knight("돈키호테",30);
    // 정보 출력
    System.out.println("[객체 생성]");
    System.out.printf("%s\n",knight.toString());
    // 체력 증가: 기존 체력 + 30
    knight.setHp(knight.getHp()+30);
    // 결과 출력
    System.out.println("[체력 증가 +30]");
    System.out.printf("%s\n",knight.toString());
    
  }
}

class Knight {
  // 필드
  private String name;
  private int hp;
  // 생성자
  public Knight(String name, int hp) {
    this.name=name;
    this.hp=hp;
  }
  // 게터
  public int getHp() {
    return this.hp;
  }
  // 세터
  public void setHp(int hp) {
    this.hp=hp;
  }
  //toString()
  public String toString() {
    return String.format(" Knight { name: %s, hp: %d }",this.name,this.hp);
  }
}