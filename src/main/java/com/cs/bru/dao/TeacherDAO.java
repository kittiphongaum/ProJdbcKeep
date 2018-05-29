package com.cs.bru.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Teacher;
import com.cs.bru.util.ConnectDB;
@Repository
public class TeacherDAO {
		public Teacher MyTeacherByID(String TeachID) throws SQLException {
			Teacher bean = new Teacher();
			ConnectDB con = new ConnectDB();
			PreparedStatement preperd = null;
			StringBuilder sql = new StringBuilder();
			try {
				sql.append(" SELECT * FROM t_teacher WHERE TeachID = ? ");
				preperd = con.openConnect().prepareStatement(sql.toString());
				preperd.setString(1,TeachID);
				ResultSet rs =preperd.executeQuery();
				
				while(rs.next()) {
					
					bean.setTeachID(rs.getString("TeachID"));
					bean.setTeacherName(rs.getString("TeacherName"));
					bean.setTeacherFname(rs.getString("TeacherFname"));
				
					
					
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
		public void insertTeacther(Teacher bean) throws Exception {
			ConnectDB con = new ConnectDB();
			PreparedStatement prepared = null;
			StringBuilder sql = new StringBuilder();
			try {
				sql.append("INSERT INTO t_teacher (TeachID,TeacherPass, TeacherName,TeacherFname) VALUES(?,?,?,?) ");
				prepared = con.openConnect().prepareStatement(sql.toString());
				prepared.setString(1, bean.getTeachID());
				prepared.setString(2, bean.getTeacherPass());
				prepared.setString(3, bean.getTeacherName());
				prepared.setString(4, bean.getTeacherFname());
			
				prepared.executeUpdate();
				System.out.println("sssssssss");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		public void deleteTeacher(String id) {
			ConnectDB con = new ConnectDB();
			PreparedStatement prepared = null;
			StringBuilder sql = new StringBuilder();
			try {
				sql.append(" DELETE FROM t_teacher WHERE TeachID = ? ");
				prepared = con.openConnect().prepareStatement(sql.toString());
				prepared.setString(1, id);
				prepared.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // 
		/*public static void main(String[] args) throws SQLException {
			Teacher bean = new Teacher();
			TeacherDAO dao = new TeacherDAO();

			bean = dao.userMyProfile("Test");
			System.out.println("Fname = " + bean.getTeacherName());
		}*/
		
}
