package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Subject;

import com.cs.bru.util.ConnectDB;
@Repository
public class SubjactDAO {
	public Subject SubjactByID(String TeachID) throws SQLException {
		Subject bean = new Subject();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_subject WHERE SubjectID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,TeachID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setSubjectID(rs.getInt("SubjectID"));
				bean.setThaiName(rs.getString("ThaiName"));
				bean.setLearnUnit(rs.getString("LearnUnit"));
				bean.setSubjectStatus(rs.getString("SubjectStatus"));
				bean.setPatibad(rs.getInt("SubjectStatus"));
				bean.setTudsadee(rs.getInt("Tudsadee"));
				
				
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
	public void insertSubjact(Subject bean) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_subject (SubjectID,SubjectID, LearnUnit,SubjectStatus,Patibad,Tudsadee) VALUES(?,?,?,?,?,?) ");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, bean.getSubjectID());
			prepared.setString(2, bean.getThaiName());
			prepared.setString(3, bean.getLearnUnit());
			prepared.setString(4, bean.getSubjectStatus());
			prepared.setInt(5, bean.getPatibad());
			prepared.setInt(6, bean.getTudsadee());
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
