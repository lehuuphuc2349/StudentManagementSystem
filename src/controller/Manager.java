/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
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
		while(result.next()) {
			listStudent.add(new Student(result.getString("ID"), result.getString("Name"), result.getString("Email"), result.getString("City"), result.getString("GPA")));
		}
		result.close();
		statment.close();
		connection.close();
		return listStudent;	
	}
}
