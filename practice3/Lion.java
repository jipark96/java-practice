package practice3;

public class Lion extends Animal implements BarkablePredator {
  public String getFood() {
    return "banana";
  }

  public void bark() {
    System.out.println("어어어어흥");
  }
}
