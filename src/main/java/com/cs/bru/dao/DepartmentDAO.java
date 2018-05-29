package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Department;

import com.cs.bru.util.ConnectDB;
@Repository
public class DepartmentDAO {
	public Department DepartmentByID(String DepartmentID) throws SQLException {
		Department bean = new Department();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_teacher WHERE TeachID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,DepartmentID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setDepartmentID(rs.getInt("TeachID"));
				bean.setDepartmentName(rs.getString("TeacherName"));
		
			
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(con !=null) {
				con.openConnect().close();
			}
		}
		return bean;
	}
	public void insertDepartment(Department bean) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_department (DepartmentID,DepartmentNname) VALUES(?,?)");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, bean.getDepartmentID());
			prepared.setString(2, bean.getDepartmentName());
			
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
