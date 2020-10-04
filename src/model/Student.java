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
	private int ID;
	private String Name;
	private String Email;
	private String City;
	private float GPA;

	public Student() {
	}

	public Student(int ID, String Name, String Email, String City, float GPA) {
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
		this.City = City;
		this.GPA = GPA;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
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

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float GPA) {
		this.GPA = GPA;
	}
	
	public void InputInfomation() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Student ID:");
		ID = input.nextInt();
		System.out.println("Input Student Name:");
		Name = input.next();
		System.out.println("Input Student Email:");
		Email = input.next();
		System.out.println("Input Student City:");
		City = input.next();
		System.out.println("Input Student GPA:");
		GPA = input.nextFloat();
	}
	
}
