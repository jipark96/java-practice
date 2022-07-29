package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentJi = new Student(100,"Ji");
		studentJi.setKorea(100);
		studentJi.setMath(100);
		
		Student studentTom = new Student(101,"Toms");
		studentTom.setKorea(80);
		studentTom.setMath(40);
		
		studentJi.showStudentInfo();
		studentTom.showStudentInfo();
	}

}
