package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.Position;

import com.cs.bru.util.ConnectDB;
@Repository
public class PositionDAO {
	public Position PositionByID(String PositionID) throws SQLException {
		Position bean = new Position();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_position WHERE PositionID = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1,PositionID);
			ResultSet rs =preperd.executeQuery();
			
			while(rs.next()) {
				
				bean.setPositionID(rs.getInt("PositionID"));
				bean.setPositionName(rs.getString("PositionName"));
				bean.setNumTeach(rs.getInt("NumTeach"));
				bean.setNumBerk(rs.getInt("NumBerk"));
			
				
				
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
	public void insertPosition(Position Position) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append("INSERT INTO t_position (PositionID,PositionName, NumTeach,NumBerk) VALUES(?,?,?,?)");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setInt(1, Position.getPositionID());
			prepared.setString(2, Position.getPositionName());
			prepared.setInt(3, Position.getNumTeach());
			prepared.setInt(4, Position.getNumBerk());
		
			prepared.executeUpdate();
			/*System.out.println("sssssssss");*/
		} catch (Exception e) {
		}
	}
}
