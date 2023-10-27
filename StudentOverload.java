package week3.assignments;

public class StudentOverload {

	public void getStudentInfo(int id) {
		System.out.println("ID: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID: "+id + " "+"Name: "+name);
	}
	public void getStudentInfo(String email,long phonenum) {
		System.out.println("Email "+email+" "+"Phone Number "+phonenum);
	}
	public static void main(String[] args) {
		StudentOverload student =new StudentOverload();
		student.getStudentInfo(42);
		student.getStudentInfo(42, "John");
		student.getStudentInfo("abc@gmail.com", 1234567891);

	}

}
