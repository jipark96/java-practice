import java.util.Arrays;

public class problem6 {
  public static void main(String[] args) {
    int[] A ={20,55,67,83,49,11,91,86,67};
    // int sum = 0;
    // for(int a : A) {
    //   if(a>=50) {
    //     sum = sum +a;
    //   }
    // }
    int sum = Arrays.stream(A).filter((a)->a >=50).sum();
    System.out.println(sum);
  }
  
}
