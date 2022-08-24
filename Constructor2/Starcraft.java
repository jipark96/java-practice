package Constructor2;

public class Starcraft {
  public static void main (String[] args) {
    // 객체 생성
    Marine m1 = new Marine("레이너", 80);
    Medic m2 = new Medic("모랄레스",60,60);
    // 마린의 스팀팩!
    m1.stimpack();
    // 메딕의 힐!
    m2.heal(m1);


  }
}

class Marine {
  String name;
  int hp;

  Marine(String n, int h) {
    name = n;
    hp=h;
  }


void stimpack() {
  System.out.printf("[%s]의 스팀팩! HP : %d -> ",name,hp);
  hp -= 10;
  System.out.printf("%d\n",hp);
}
}
class Medic {
  String name;
  int hp;
  int mp;

  Medic(String n, int h, int m) {
    name=n;
    int hp = h;
    int mp = m;
  }


void heal(Marine target) {
  System.out.printf("[%s]의 치유! => [%s] HP(%d -> ",name,target.name,target.hp);
  target.hp += 10;
  System.out.printf("%d)\n",target.hp);
}
}
