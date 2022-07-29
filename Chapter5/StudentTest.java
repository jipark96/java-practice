package Chapter5;

public class StudentTest {
  
  public static void main(String[] args) {

	  Student studentPark = new Student(); //studentPark은 지역변수
	  studentPark.studentName="박지현";
	  studentPark.studentID=100;
	  studentPark.address="서울";
	  
	  Student studentLee = new Student();
	  studentLee.studentName="이순신";
	  studentLee.studentID=101;
	  studentLee.address="서울";
	  
	  studentPark.showStudentInfor();
	  studentLee.showStudentInfor();
	  
	  System.out.println(studentPark);
	  System.out.println(studentLee);
  }
}
