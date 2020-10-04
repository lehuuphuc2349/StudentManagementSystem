/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Phucdz
 */
public class Manager {

	public static List<Student> getStudentList() throws Exception {
		List<Student> listStudent = new ArrayList<>();
		Connection connection = controller.ConnectDatabaseMySQL.connectMySQLSerVer();
		String query = "Select ID, Name, Email, City, GPA from Student";
		Statement statment = connection.createStatement();
		ResultSet result = statment.executeQuery(query);
		while (result.next()) {
			listStudent.add(new Student(result.getString("ID"), result.getString("Name"), result.getString("Email"), result.getString("City"), result.getString("GPA")));
		}
		result.close();
		statment.close();
		connection.close();
		return listStudent;
	}

	public static Student getStudentByID(String ID) throws Exception {
		Student student = null;
		Connection connection = controller.ConnectDatabaseMySQL.connectMySQLSerVer();
		String query = "select ID, Name, Email, City, GPA from Student where ID=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, ID);
		ResultSet result = preparedStatement.executeQuery();
		if (result.next()) {
			student = new Student(result.getString("ID"), result.getString("Name"), result.getString("Email"), result.getString("City"), result.getString("GPA"));
		}
		result.close();
		preparedStatement.close();
		connection.close();
		return student;
	}

	public static int InsertStudent(Student student) throws Exception {
		if (getStudentByID(student.getID()) == null) {
			Connection connection = controller.ConnectDatabaseMySQL.connectMySQLSerVer();
			String query = "Insert Into Student Values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, student.getID());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setString(4, student.getCity());
			preparedStatement.setString(5, student.getGPA());
			return preparedStatement.executeUpdate();
		}
		return 0;
	}
}
