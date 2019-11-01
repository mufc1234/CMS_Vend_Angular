package com.cms.connection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UncheckBalConnection {

	static DAO dao;
	static Connection con;
	double totbal=0;
	double tempbal=0;
	public double findingubal(int ven_id)
	{ 
		 
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
		    String sql1 = "select o.order_id,o.Tprice from `order` o  left join vendor ve on o.vendor_id=ve.vendor_id  where o.status = 0 and o.checkstatus = 'false' and o.vendor_id = ? ";
		    PreparedStatement ps1 = con.prepareStatement(sql1);
		    ps1.setInt(1,ven_id);
		    ResultSet rs = ps1.executeQuery();
		    
		    String sql2 = "update `order` set checkstatus = 'true' where status = 0 and order_id = ? ";
		    PreparedStatement ps2 = con.prepareStatement(sql2);
		   
		    
		    String sql3 = "select vm.balance from vendor vm where vendor_id = ? ";
		    PreparedStatement ps3 = con.prepareStatement(sql3);
		    ps3.setInt(1,ven_id);
		    ResultSet rs2 = ps3.executeQuery();
		    
		    while(rs2.next())
		    {
		    	tempbal=tempbal+ rs2.getDouble("vm.balance");
		    	
		    }
		    
		   while(rs.next())
		   {   
			   totbal = totbal + rs.getDouble("o.Tprice");
			  
			 ps2.setInt(1, Integer.parseInt(rs.getString("o.order_id")));      
			   
			 ps2.executeUpdate();  
		   }
		   System.out.println();
		   System.out.println("the total unchecked balance before is "+totbal);
		   System.out.println();
		   totbal=totbal+tempbal;
		    System.out.println("the total unchecked balance is "+totbal);
		    
		    String sql4 = "update `vendor` set balance = ? where vendor_id= ? ";
		    PreparedStatement ps4 = con.prepareStatement(sql4);
		    ps4.setDouble(1, totbal);
		    ps4.setInt(2, ven_id);
		    ps4.executeUpdate();
			  return totbal; 
			 
			}
		  
		
			
		 
			
			catch(Exception e) {
				System.out.println(e);
			    return -1;
			}
		
		
	}
	
	
	
}
