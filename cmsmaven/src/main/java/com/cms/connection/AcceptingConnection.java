package com.cms.connection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcceptingConnection {

	static DAO dao;
	static Connection con;
	
	public String acceptconnection(int oid)
	{
		
		
		try {
			dao = new DAO();
			con = dao.getConnection();
			   String sql = "update `order` set status = 1,Msg = 'Thank you for taking the order' where order_id= ? ";
			    PreparedStatement ps4 = con.prepareStatement(sql);
			    ps4.setInt(1, oid);
			    ps4.executeUpdate();
			
			
			return "data successfully accepted";
		}
		
		catch(Exception e){
			
		return null;
		}
		
		
		
	}
}
