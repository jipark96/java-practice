package Exceptionpractice1;

class FoolException extends Exception { 
}

public class Sample2 {
  public void sayNick(String nick) {
    try {
    if("fool".equals(nick)) {
      throw new FoolException();
    }
    System.out.println("당신의 별명은 " +nick+" 입니다.");
  } catch(FoolException e) {
    System.err.println("FoolExceptio이 발생했습니다.");
  }
  }
//예외 처리
  public static void main(String[] args) {
    Sample2 sample = new Sample2();
    sample.sayNick("fool");
    sample.sayNick("genious");
  }
}
