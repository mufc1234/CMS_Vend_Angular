package com.cms.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cms.App;
import com.cms.model.Menu_Item;

public class DeleteMenuConnection {
	static DAO dao;
	static Connection con;
	public String deletemenu(int men_id,int vendoid)
	{ 
		 
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
		    
		   
		    String sql = "delete from menu_item where item_id = ? and vendor_id = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);
			  
			  ps.setInt(1,men_id);
			  ps.setInt(2, vendoid);
			  ps.executeUpdate();
			  
			  
			  return "successfully deleted"; 
			 
			}
		  
		
			
		 
			
			catch(Exception e) {
				System.out.println(e);
			    return null;
			}
		
		
	}
}
