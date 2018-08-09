package com.bdi.erp.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.erp.common.DBConnection;

public class DBTest {

	public static void main(String[] args) {
		List<Map<String,String>> userList = 
				new ArrayList<Map<String,String>>();
		Connection con = null;
		try {
			con = DBConnection.getCon();
			String sql = "select * from user_info";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Map<String,String> user;
			while(rs.next()) {
				user = new HashMap<String,String>();
				user.put("uiNum",rs.getString("uiNum"));
				user.put("uiName",rs.getString("uiName"));
				user.put("uiId",rs.getString("uiId"));
				user.put("uiPwd",rs.getString("uiPwd"));
				user.put("uiEmail",rs.getString("uiEmail"));
				user.put("uiEtc",rs.getString("uiEtc"));
				user.put("credat",rs.getString("credat"));
				user.put("cretim",rs.getString("cretim"));
				user.put("creusr",rs.getString("creusr"));
				user.put("moddat",rs.getString("moddat"));
				user.put("modtim",rs.getString("modtim"));
				user.put("modusr",rs.getString("modusr"));
				user.put("diNum",rs.getString("diNum"));
				userList.add(user);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {				
				DBConnection.closeCon();
			}
		}
		System.out.println(userList);
	}
}
