package com.cs.bru.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.cs.bru.model.NormalTeaching;
import com.cs.bru.util.ConnectDB;

@Repository
public class TeachingNormalDAO {
	public NormalTeaching TeachingNormal(String NormaliD) throws SQLException {
		NormalTeaching normal = new NormalTeaching();
		ConnectDB con = new ConnectDB();
		PreparedStatement preperd = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" SELECT * FROM t_normalteaching WHERE NormaliD = ? ");
			preperd = con.openConnect().prepareStatement(sql.toString());
			preperd.setString(1, NormaliD);
			ResultSet rs = preperd.executeQuery();
			while (rs.next()) {
				normal.setNormalid(rs.getString("NormaliD"));
				normal.setVolpreriod(rs.getInt("Volpreriod"));
				normal.setDateHour(rs.getInt("DateHour"));
			/*	normal.setTermID(rs.getInt("TermID"));
				normal.setTeachID(rs.getInt("TeachID"));
				normal.setSubjectID(rs.getInt("SubjectID"));
				normal.setStopID(rs.getInt("StopID"));
				normal.setStudylevelId(rs.getInt("StudylevelId"));*/
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (con != null) {
				con.openConnect().close();
			}
		}

		return normal;
	}

	public void insertNormal(NormalTeaching normal) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();

		try {
			sql.append(
					"INSERT INTO t_normalteaching('NormaliD', 'Volpreriod', 'DateHour') VALUES(?,?,?)");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setString(1, normal.getNormalid());
			prepared.setInt(2, normal.getVolpreriod());
			prepared.setInt(3, normal.getDateHour());
			/*prepared.setInt(4, normal.getTermID());
			prepared.setInt(5, normal.getTeachID());
			prepared.setInt(6, normal.getSubjectID());
			prepared.setInt(7, normal.getStopID());
			prepared.setInt(8, normal.getStudylevelId());*/

			prepared.executeUpdate();
			System.out.println("sssssssss"); 
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void updateNomal(NormalTeaching normal) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" UPDATE t_normalteaching SET  NormaliD = ? ,Volpreriod = ?,DateHour = ?");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setString(1, normal.getNormalid());
			prepared.setInt(2, normal.getVolpreriod());
			prepared.setInt(3, normal.getDateHour());
			

			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}// end method update

	// delete
	public void delete(String NormaliD) {
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		try {
			sql.append(" DELETE FROM t_normalteaching WHERE NormaliD = ? ");
			prepared = con.openConnect().prepareStatement(sql.toString());
			prepared.setString(1, NormaliD);
			prepared.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
