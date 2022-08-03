package Threadpracice;

import java.util.ArrayList;

public class Sample implements Runnable {
  int seq;
  public Sample(int seq) {
    this.seq = seq;
  }

  public void run() {
    System.out.println(this.seq + " thread start"); // 쓰레드 시작
    try {
      Thread.sleep(1000); // 1초 대기
    } catch(Exception e) {
    }
    System.out.println(this.seq+ " thread end"); //쓰레드 종료
  }
  public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<>();
    for (int i =0; i<10; i++) {  // 10개 쓰레드 생성
      Thread t = new Thread(new Sample(i));
      t.start();
      threads.add(t);
    }
    for(int i=0; i<threads.size(); i++) {
      Thread t = threads.get(i);
      try {
        t.join(); //t 쓰레드가 종료할 때까지 기다림
      } catch(Exception e) {

      }
    }

    System.out.println("main end"); //메소드 종료
  }
}
