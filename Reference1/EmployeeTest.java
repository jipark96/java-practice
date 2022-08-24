package Reference1;

public class EmployeeTest {
  public static void main(String[] args) {
    // 배열 생성
    int[] hours0 = { 2, 4, 3, 4, 5, 8, 8 };
    int[] hours1 = {7,3,4,3,3,4,4};
    // 객체 생성
    Employee e0 = new Employee("직원0", hours0);
    Employee e1 = new Employee("직원1", hours1);
    // 객체 배열 만들기
    Employee[] employees = { e0,e1 };
    // 정보 출력
    for (int i = 0; i < employees.length; i++) {
      employees[i].printTotalHours();
    }
  }
}

// 직원 클래스
class Employee {
  // 필드
  String name; // 이름
  int[] hours; // 요일별 일한 시간
  
  // 생성자
  Employee(String str, int[] arr) {
    name = str;
    hours = arr;
  }
  
  // 메소드
  void printTotalHours() {
    System.out.printf("%s -> %d 시간\n", name, totalHours());
  }
  
  int totalHours() {
    int sum = 0;
    for (int i = 0; i < hours.length; i++) {
      sum += hours[i];
    }
    return sum;
  }
}