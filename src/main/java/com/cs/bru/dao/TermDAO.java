package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Term;
import com.cs.bru.util.ConnectDB;
@Repository
public class TermDAO {
	public Term TermByID(String TermID) throws SQLException {
		Term bean = new Term();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_term WHERE TermID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,TermID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setTermID(rs.getInt("TermID"));
				bean.setTermName(rs.getInt("ThaiName"));
				bean.setYearTerm(rs.getInt("YearTerm"));
				bean.setStartTeach(rs.getString("StartTeach"));
				bean.setStopTeach(rs.getString("StopTeach"));
				
				
				
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
	public void insertTerm(Term bean) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_term (TermID,TermName, YearTerm,StartTeach,StopTeach) VALUES(?,?,?,?,?) ");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, bean.getTermID());
			prepared.setInt(2, bean.getTermName());
			prepared.setInt(3, bean.getYearTerm());
			prepared.setString(4, bean.getStartTeach());
			prepared.setString(5, bean.getStopTeach());
		
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
