package Exceptionpractice1;

public class Sample {
  public void shouldBeRun() {
    System.out.println("thank you!");
  }

  public static void main(String[] args) {
    Sample sample = new Sample();
    int c;
    try {
      c= 4 / 0;
      sample.shouldBeRun();
    } catch (ArithmeticException e) {
      c = -2;
    } finally {
      sample.shouldBeRun();
    }
  }
}
