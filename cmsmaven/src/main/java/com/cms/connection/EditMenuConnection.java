package com.cms.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EditMenuConnection {

	static DAO dao;
	static Connection con;
	public String editmenu(int men_id,float new_price,String new_name,int vendo_id)
	{ 
		 
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
		  
			
		    String sql = "update menu_item set item_price = ? , item_name=? where item_id = ? and Vendor_id=?"; 
			PreparedStatement ps = con.prepareStatement(sql);
			  
			  ps.setFloat(1,new_price);
			  
			  ps.setString(2,new_name);
			  ps.setInt(3, men_id);
			  ps.setInt(4, vendo_id);
			  ps.executeUpdate();
			  
			  
			  return "successfully updated"; 
			 
			}
		  
		
			
		 
			
			catch(Exception e) {
				System.out.println(e);
			    return null;
			}
		
		
	}
	
	
}
