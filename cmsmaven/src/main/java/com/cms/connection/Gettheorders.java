package com.cms.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cms.App;
import com.cms.model.CombinedClass;
import com.cms.model.Employee;
import com.cms.model.Menu_Item;
import com.cms.model.OrderJava;

public class Gettheorders {

	static DAO dao;
	static Connection con;
	 ArrayList<CombinedClass> ab= new ArrayList<CombinedClass>();
  
	public ArrayList<CombinedClass> gettingorderreq(int b)
	{

		 CombinedClass c ;
		 Employee em;
		 OrderJava or;
		 Menu_Item me;
		try {
			dao = new DAO();
			con = dao.getConnection();
		  if(b==3401)
			{System.out.println("Welcome American");
			String sql = "select u.user_name,o.order_id,o.user_id,o.quantity,o.Tprice,m.item_name from employee u inner join `order` o on u.user_id = o.user_id inner join menu_item m on m.item_id = o.item_id where o.status =0 and o.Vendor_id = ? ;";
			PreparedStatement ps = con.prepareStatement(sql);
			  ps.setInt(1, b);	
			  
			  ResultSet rs = ps.executeQuery();
			 
			  while(rs.next())
			  {  
			       c = new CombinedClass();
			       em = new Employee();
			       or = new OrderJava();
			       me  = new Menu_Item();
//				 System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//				 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//				 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//				 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//				 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//				 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
				 em.setEmployeeName(rs.getString("u.user_name"));
				  or.setOrderId(rs.getString("o.order_id"));
				  or.setEmployeeId(rs.getString("o.user_id"));
				  or.setQuantity(rs.getString("o.quantity"));
				  or.setTotalPrice(rs.getString("o.Tprice"));
				  me.setItemName(rs.getString("m.item_name"));
				  
			    c.setVuser_name(em.getEmployeeName());	  
			     c.setVorder_id(or.getOrderId());
				 c.setVuser_id(or.getEmployeeId());
				 c.setVquantity(or.getQuantity());
				 c.setvTotalprice(or.getTotalPrice());
				 c.setVitem_name(me.getItemName());
				 
				 ab.add(c);
			  }
			}
		  else if(b==3402)
		  { 
			  System.out.println("Welcome Inidan");
				String sql = "select u.user_name,o.order_id,o.user_id,o.quantity,o.Tprice,m.item_name from employee u inner join `order` o on u.user_id = o.user_id inner join menu_item m on m.item_id = o.item_id where o.status =0 and o.Vendor_id = ? ;";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
				  
				  ResultSet rs = ps.executeQuery();
				 
				  while(rs.next())
				  {  
				       c = new CombinedClass();
				       em = new Employee();
				       or = new OrderJava();
				       me  = new Menu_Item();
//					 System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//					 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//					 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//					 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//					 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//					 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
					 em.setEmployeeName(rs.getString("u.user_name"));
					  or.setOrderId(rs.getString("o.order_id"));
					  or.setEmployeeId(rs.getString("o.user_id"));
					  or.setQuantity(rs.getString("o.quantity"));
					  or.setTotalPrice(rs.getString("o.Tprice"));
					  me.setItemName(rs.getString("m.item_name"));
					  
					  c.setVuser_name(em.getEmployeeName());	  
					     c.setVorder_id(or.getOrderId());
						 c.setVuser_id(or.getEmployeeId());
						 c.setVquantity(or.getQuantity());
						 c.setvTotalprice(or.getTotalPrice());
						 c.setVitem_name(me.getItemName());
						 
					 
					 ab.add(c);
				  }
				  
		  }
		  else if(b==3403)
		  {
			  System.out.println("Welcome Mexican");
			  
				String sql = "select u.user_name,o.order_id,o.user_id,o.quantity,o.Tprice,m.item_name from employee u inner join `order` o on u.user_id = o.user_id inner join menu_item m on m.item_id = o.item_id where o.status =0 and o.Vendor_id = ? ;";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
				  
				  ResultSet rs = ps.executeQuery();
				 
				  while(rs.next())
				  {  
				       c = new CombinedClass();
				       em = new Employee();
				       or = new OrderJava();
				       me  = new Menu_Item();
//					 System.out.println("The Vendor Id  is:  "+rs.getString("vendor_id")); 
//					 System.out.println("The Vendor Name  is:  "+rs.getString("vendor_name"));
//					 System.out.println("The Vendor Email is:  "+rs.getString("email"));
//					 System.out.println("The Vendor Phone is:  "+rs.getString("phone"));
//					 System.out.println("The Vendor UserName is:  "+rs.getString("uname"));
//					 System.out.println("The Vendor Balance is:  "+rs.getString("balance"));
					 em.setEmployeeName(rs.getString("u.user_name"));
					  or.setOrderId(rs.getString("o.order_id"));
					  or.setEmployeeId(rs.getString("o.user_id"));
					  or.setQuantity(rs.getString("o.quantity"));
					  or.setTotalPrice(rs.getString("o.Tprice"));
					  me.setItemName(rs.getString("m.item_name"));
					  
					  c.setVuser_name(em.getEmployeeName());	  
					     c.setVorder_id(or.getOrderId());
						 c.setVuser_id(or.getEmployeeId());
						 c.setVquantity(or.getQuantity());
						 c.setvTotalprice(or.getTotalPrice());
						 c.setVitem_name(me.getItemName());
						 
					 
					 ab.add(c);
				  }
		  
		  }
		  else
		  {
			  System.out.println("Please enter the correct option by running again");
			  App a = new App();
			  a.main(null);
		  
		  }
			return ab;
			}
			catch(Exception e) {
				System.out.println(e);
			return null;
			}
		
		
	}
		
	
}
