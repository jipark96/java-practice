package problem;
public class problem5 {
  public static void main(String[] args) {
  String a ="a:b:c:d";
  String[] temp = a.split(":");
  String result = String.join("#",temp);
  System.out.println(result);
  }
}
