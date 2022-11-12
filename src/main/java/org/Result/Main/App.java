package org.Result.Main;

import java.util.Scanner;

import org.Result.Main.Student.Repo;
import org.Result.Main.auth.Admin;
public class App {
	static Scanner scanner;
	int count=0;
	Admin admin =new Admin();
	int temp=0;
	static {
		try {
			scanner = new Scanner(System.in);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void printf(String ar) {
		System.out.println(ar);
	}
	void studentoperation(){
		printf("Select an operation of student Management");
		printf("1.Enter new Student Record");
		printf("2.modify student Record");
		printf("3.delete student Record");
		printf("4.get student Record");
		temp = scanner.nextInt();
		String id="";
		switch(temp){
				case 1: 
					new Repo().menucreatestudent();
				break;
				case 2:
					printf("Enter the Student hallticket for modify");
					 id = scanner.next();
					if(new Repo().getStudent(id).equals(id)) {
							new Repo().modifyStudent();
					}else {
						printf("not found");
						printf("please try again");
					}
					break;
				case 3:
					printf("Enter the Student hallticket for Delete");
					id = scanner.next();
					if(new Repo().getStudent(id).equals(id)) {
							new Repo().deleteStudent();
					}else {
						printf("not found");
						printf("please try again");
					}
					break;
				case 4:
					printf("Enter the Student hallticket get the details");
					id = scanner.next();
					
					if(new Repo().getStudent(id).equals(id)) {
							new Repo().GetStudentDetails(new Repo().getsingleStudent(id));
					}else {
						printf("not found");
						printf("please try again");

					}
					default:
						printf("try again later");
						menu(admin.getHashkey());
					
			}
			studentoperation();
		
	}
	void managementoperation(){

	}
	private void menu(String hashkey){
		if(hashkey.equals(admin.getHashkey())){
			printf("login successfull");
			printf("select a operation");
			printf("1.student Management");
			printf("2.Result Management");
			int temp = scanner.nextInt();
			if(temp == 1){
				studentoperation();
			}else if(temp==2){
				managementoperation();
			}else{
				printf("try again\n\n-->");
				menu(hashkey);
			}
		}
	}
	private int run() {
		printf(count+" times has upto 3");
		printf("Enter the user id");
		
		admin.setUserid("admin");
		admin.setPassword("admin");
		String userid= scanner.next();
		printf("Enter the password id");
		String password= scanner.next();
		
		if(admin.getUserid().equals(userid) && admin.getPassword().equals(password)){
			admin.setHashkey("#123#");
			//System.out.flush();
			menu(admin.getHashkey());
		}else {
			printf("try again");
			count++;
			if(count==3) System.exit(1);
			run();
		}
		return 1;
	}
	public static void main(String[] args) {
	printf("Result Management system :\n select an option 1.login 2. exit");
		if(scanner.nextInt() == 1) new App().run();
			else 
			System.exit(1);
	}
}
