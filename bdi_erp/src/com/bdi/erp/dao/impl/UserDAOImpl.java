package com.bdi.erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.erp.common.DBConnection;
import com.bdi.erp.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

	@Override
	public boolean login(String id, String pwd) {
		Connection con = DBConnection.getCon();
		String sql = "select count(*) from user_info";
		sql += " where uiId=? and uiPwd=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			rs.next();
			int cnt = rs.getInt(1);
			if(cnt==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Map<String,String>> getUserList(){
		String sql = "select * from user_info";
		List<Map<String, String>> userList = null;
		try {
			userList = DBConnection.selectList(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
}
