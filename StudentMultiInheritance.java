package week3.assignments;

public class StudentMultiInheritance extends DepartmentMultiInheritance{
	
	public void studentName() {
		System.out.println("Student Name - Test");
	}
	public void studentDept() {
		System.out.println("Student Department - CT");
	}
	public void studentId() {
		System.out.println("Student Id - 23CT42");
	}
	
	public static void main(String[] args) {
		
		StudentMultiInheritance student = new StudentMultiInheritance();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
	

}
