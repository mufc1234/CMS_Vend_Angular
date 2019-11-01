package com.cms.connection;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cms.App;
import com.cms.model.Menu_Item;

public class AddMenuConnection {

	static DAO dao;
	static Connection con;
	public String addmenu(String it_name,float it_price,int b)
	{ 
		Menu_Item m ; 
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
		  if(b==3401)
			{System.out.println("Welcome American");
			String sql = "Insert into menu_item(item_name,item_price,Vendor_id) Values(?,?,?)"; 
			PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, it_name);
			  ps.setFloat(2,it_price);
			 
			  ps.setInt(3, b);
			  
			  ps.executeUpdate();
			  
			  
			  
			 
			}
		  else if(b==3402)
		  { 
			  System.out.println("Welcome Indian");  
			  String sql = "Insert into menu_item(item_name,item_price,Vendor_id) Values(?,?,?)"; 
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setString(1, it_name);
				  ps.setFloat(2,it_price);
				  
				  ps.setInt(3, b);
				  
				  ps.executeUpdate();
				  
				  
				  
		  }
		  else if(b==3403)
		  {
			  System.out.println("Welcome Mexican");
			  String sql = "Insert into menu_item(item_name,item_price,Vendor_id) Values(?,?,?)"; 
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setString(1, it_name);
				  ps.setFloat(2,it_price);
				  
				  ps.setInt(3, b);
				  
				  ps.executeUpdate();
		  
		  }
		  else
		  {
			  System.out.println("Please enter the correct option by running again");
			  App a = new App();
			  a.main(null);
		  
		  }
			
		 return "data successfully inserted";
			}
			catch(Exception e) {
				System.out.println(e);
			    return null;
			}
		
		
	}

	
	}

