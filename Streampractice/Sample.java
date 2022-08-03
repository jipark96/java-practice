package Streampractice;
// import java.util.*;
// public class Sample {
//   public static void main(String[] args) {
//     int[] data = {7,8,3,4,6,2,2,2,1,5,1,8,9};

//     //짝수만 포함하는 배열리스트 생성
//     ArrayList<Integer> dataList = new ArrayList<>();
//         for(int i=0; i<data.length; i++) {
//             if(data[i] % 2 == 0) {
//                 dataList.add(data[i]);
//             }
//         }
//     // Set으로 중복제거
//     HashSet<Integer> dataSet = new HashSet<>(dataList);
//     // Set으로 다시 List로 변경
//     ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
//     // 역순으로 정렬
//     distinctList.sort(Comparator.reverseOrder());
//     // Integer 리스트를 정수 배열로 변환
//     int[] result = new int[distinctList.size()];
//         for(int i=0; i< distinctList.size(); i++) {
//             result[i] = distinctList.get(i);
//         }
//     }
// }
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
  public static void main(String[] args) {
    int[] data ={7,8,3,4,6,2,2,2,1,5,1,8,9};
    int[] result = Arrays.stream(data) //IntStream을 생성
    .boxed() // IntStream을 Stream<Integer>로 변경
    .filter((a) -> a % 2 == 0) // 짝수만 걸러냄
    .distinct() // 중복을 제거
    .sorted(Comparator.reverseOrder()) // 역순으로 정렬
    .mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변경
    .toArray() // int[] 배열로 반환
    ;
    System.out.println(result);
  }
}