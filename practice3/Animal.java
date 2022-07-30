package practice3;

interface Predator {
  String getFood();

  default void printFood() {
    System.out.printf("my food is %s\n",getFood());
  }
}

interface Barkable {
  void bark();
}

interface BarkablePredator extends Predator, Barkable {
}

public class Animal {
  String name;

  void setName(String name) {
    this.name = name;
  }
  
}
