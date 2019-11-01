package com.cms.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cms.App;
import com.cms.model.VendorJava;

public class DisplayVendorProfile {
	static DAO dao;
	static Connection con;
	 ArrayList<VendorJava> ab= new ArrayList<VendorJava>();
	public ArrayList dispvenprof(int b)
	{
		
		 VendorJava v ;
		try {
			dao = new DAO();
			con = dao.getConnection();
		  if(b==3401)
			{System.out.println("Welcome American");
			String sql = "Select vendor_id,vendor_name,email,phone,uname,balance,password from Vendor where Vendor_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			  ps.setInt(1, b);	
			  
			  ResultSet rs = ps.executeQuery();
			 
			  while(rs.next())
			  {  
			       v = new VendorJava();
//				 System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//				 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//				 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//				 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//				 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//				 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
				 
				  v.setVendorId(rs.getString("vendor_id"));
				  v.setVendorName(rs.getString("vendor_name"));
				  v.setVendorEmail(rs.getString("email"));
				  v.setVendorPhone(rs.getString("phone"));
				  v.setVendorUname(rs.getString("uname"));
				  v.setVendorBalance(rs.getString("balance"));
				  v.setVendorPassword(rs.getString("password"));
				  ab.add(v);
				  
			  }
			}
		  else if(b==3402)
		  { 
			  System.out.println("Welcome Indian");  
			  String sql = "Select vendor_id,vendor_name,email,phone,uname,balance from Vendor where Vendor_id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
			  
				  ResultSet rs = ps.executeQuery();
				  int count=0;
				  while(rs.next())
				  {  			 
//					  System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//					 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//					 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//					 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//					 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//					 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
					  v = new VendorJava();
				  v.setVendorId(rs.getString("vendor_id"));
				  v.setVendorName(rs.getString("vendor_name"));
				  v.setVendorEmail(rs.getString("email"));
				  v.setVendorPhone(rs.getString("phone"));
				  v.setVendorUname(rs.getString("uname"));
				  v.setVendorBalance(rs.getString("balance"));
					 
				  ab.add(v);
				  }
				  
				  
		  }
		  else if(b==3403)
		  {
			  System.out.println("Welcome Mexican");
			  String sql = "Select vendor_id,vendor_name,email,phone,uname,balance from Vendor where Vendor_id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
				  ResultSet rs = ps.executeQuery();
				  int count=0;
				  while(rs.next()) {
//				  { 		 System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//					 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//					 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//					 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//					 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//					 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
					 
					 
					 
					  v = new VendorJava();
					  v.setVendorId(rs.getString("vendor_id"));
					  v.setVendorName(rs.getString("vendor_name"));
					  v.setVendorEmail(rs.getString("email"));
					  v.setVendorPhone(rs.getString("phone"));
					  v.setVendorUname(rs.getString("uname"));
					  v.setVendorBalance(rs.getString("balance"));
						 
					  ab.add(v);
					 
				  }
		  
		  }
		  else
		  {
			  System.out.println("Please enter the correct option by running again");
			  App a = new App();
			  a.main(null);
		  
		  }
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
		return ab;
	}
	}

