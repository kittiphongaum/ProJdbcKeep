package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Faculty;

import com.cs.bru.util.ConnectDB;
@Repository
public class FacultyDAO {
	public Faculty FacultyByID(String TeachID) throws SQLException {
		Faculty bean = new Faculty();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_faculty WHERE FacultyID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,TeachID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setFacultyID(rs.getInt("FacultyID"));
				bean.setFacultyName(rs.getString("FacultyName"));
				
				
				
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
	public void insertFaculty(Faculty bean) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_faculty (FacultyID,FacultyName) VALUES(?,?)");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, bean.getFacultyID());
			prepared.setString(2, bean.getFacultyName());
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
