package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Rate;
import com.cs.bru.model.Term;
import com.cs.bru.util.ConnectDB;
@Repository
public class RateDAO {
	public Rate RateByID(String RateID) throws SQLException {
		Rate bean = new Rate();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_term WHERE RateID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,RateID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setRateID(rs.getInt("TermID"));
				bean.setPriceTudsadee(rs.getInt("PriceTudsadee"));
				bean.setStudentNum(rs.getInt("StudentNum"));
				
				
				
				
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
	public void insertRate(Rate Rate) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_rate (RateID,PriceTudsadee, StudentNum) VALUES(?,?,?) ");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, Rate.getRateID());
			prepared.setInt(2, Rate.getPriceTudsadee());
			prepared.setInt(3, Rate.getStudentNum());
		
		
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
