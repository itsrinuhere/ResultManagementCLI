package org.Result.Main.Student;

public class Repo {
	static void printf(String ar) {
		System.out.println(ar);
	}
public void menucreatestudent() {
	printf("Enter student name");
	printf("Enter student hallticket number");
	printf("Enter the student Branch --> AS  CSE,MECH,ECE");
	printf("Enter the student Year 		-->   As I , II,III,IV");
}
public String getStudent(String id) {
	return id;
} public void modifyStudent() {
	
}
public void deleteStudent() {
	// TODO Auto-generated method stub
	
}
public Student getsingleStudent(String id){
	Student student = new Student();
	return student;
}
public void GetStudentDetails(Student student) {
	// TODO Auto-generated method stub
	printf("student Name :"+student.getStudentName());
	printf("student Year  :"+student.getStudentYear());
	printf("student hallticket Number "+student.getStudenthallticket());
	printf("student branch   :"+student.getStudentBranch());
	printf("student year   :"+student.getStudentYear());
}
}
