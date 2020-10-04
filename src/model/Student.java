/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Phucdz
 */
public class Student {
	private String ID;
	private String Name;
	private String Email;
	private String City;
	private String GPA;

	public Student() {
	}

	public Student(String ID, String Name, String Email, String City, String GPA) {
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
		this.City = City;
		this.GPA = GPA;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getGPA() {
		return GPA;
	}

	public void setGPA(String GPA) {
		this.GPA = GPA;
	}
	
	public void InputInfomation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Student ID:");
		ID = input.next();
		System.out.println("Input Student Name:");
		Name = input.next();
		System.out.println("Input Student Email:");
		Email = input.next();
		System.out.println("Input Student City:");
		City = input.next();
		System.out.println("Input Student GPA:");
		GPA = input.next();
	}
	
}
