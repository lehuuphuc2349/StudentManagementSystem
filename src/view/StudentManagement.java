/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Phucdz
 */
public class StudentManagement {
	public static void InsertStudent() throws Exception {
		Student student = new Student();
		student.InputInfomation();
		Scanner input = new Scanner(System.in);
		do {
			if(controller.Manager.getStudentByID(student.getID()) != null) {
				System.out.println("Id IS EXIST, PLEASE INPUT AGAIN!!!");
				student.setID(input.next());
			} else {
				break;
			}
		} while(true);
		int result = controller.Manager.InsertStudent(student);
		if(result == 0) {
			System.out.println("ID IS EXIST");
		} else {
			System.out.println("Insert Student Success...");
		}
	}
	public static void ShowStudent() throws Exception{
		List<Student> listStudents = controller.Manager.getStudentList();
		for(int i = 0; i < listStudents.size(); i++) {
			System.out.println("Student: " + (i+1));
			System.out.println("ID: " + listStudents.get(i).getID());
			System.out.println("Name: " + listStudents.get(i).getName());
			System.out.println("Email: " + listStudents.get(i).getEmail());
			System.out.println("GPA: "+ listStudents.get(i).getGPA());
		}
		
	}
	public static void main(String[] args) throws Exception{
		String choose = null;
		boolean exit = true;
		Scanner input = new Scanner(System.in);
		showmenu();
		while(exit) {
			choose = input.next();
			switch(choose) {
				case "1" :
					InsertStudent();
					break;
				case "2" :
					ShowStudent();
					break;
				case "3" :
					exit = false;
					break;
				default: 
					System.out.println("Your InPut is Error");
					break;
					
			}
			showmenu();
		}
		
	}
	public static void showmenu() {
		System.out.println("1. Insert Student");
		System.out.println("2. Show All Student");
//		System.out.println("3. Search Student By ID");
		System.out.println("3. Exit");
	}
}
