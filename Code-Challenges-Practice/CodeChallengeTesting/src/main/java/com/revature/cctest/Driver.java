package com.revature.cctest;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Application is Working!");
		
		StudentDao studao = new StudentDaoImp();
		
		ArrayList<Student> students = studao.getAllStudent();


		System.out.println("Application is Terminating!!");
	}

}
