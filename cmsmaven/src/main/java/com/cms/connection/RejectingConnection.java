package com.cms.connection;

import java.sql.Connection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RejectingConnection {
	static DAO dao;
	static Connection con;
	double totbal=0;
	
	public double rejectconnection(int oid)
	{
		
		
		
		try {
			dao = new DAO();
			con = dao.getConnection();
		    String sql1 = "select o.Tprice,ve.balance,o.vendor_id from `order` o  left join vendor ve on o.vendor_id=ve.vendor_id  where o.order_id = ? ";
		    PreparedStatement ps1 = con.prepareStatement(sql1);
		    ps1.setInt(1,oid);
		    ResultSet rs = ps1.executeQuery();
			
			rs.next();
			double tempval =rs.getDouble("ve.balance"); 
			double temprice = rs.getDouble("o.Tprice");
			int vendid = rs.getInt("o.vendor_id");
			totbal=tempval - temprice;
			
			
			 
		    String sql4 = "update `vendor` set balance = ? where vendor_id= ? ";
		    PreparedStatement ps4 = con.prepareStatement(sql4);
		    ps4.setDouble(1, totbal);
		    ps4.setInt(2, vendid);
		    ps4.executeUpdate();
			  
		    
		    
		    String sql2 = "update `order` set status = 2,Msg = 'Not enough quantity' where order_id= ? ";
		    PreparedStatement ps2 = con.prepareStatement(sql2);
		    ps2.setInt(1, oid);
		    ps2.executeUpdate();
			
		    System.out.println();
		    System.out.println("Successfully rejected");
		    return totbal;
		}
		
		
		catch(Exception e){
			
			return -1;
		}
	}
	
	
}
