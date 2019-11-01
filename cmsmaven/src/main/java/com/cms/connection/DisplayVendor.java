package com.cms.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cms.App;
import com.cms.model.Menu_Item;


public class DisplayVendor {
	static DAO dao;
	static Connection con;
	public ArrayList displayselectedvend(int b)
	{ ArrayList<Menu_Item> aa = new ArrayList<Menu_Item>();
		Menu_Item m ; 
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
		  if(b==3401)
			{System.out.println("Welcome American");
			String sql = "Select m.item_id,m.item_name,m.item_price,m.item_image,m.Vendor_id from Vendor v left join menu_item m on v.Vendor_id = m.Vendor_id where v.Vendor_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			  ps.setInt(1, b);	
			  
			  ResultSet rs = ps.executeQuery();
			  int count=0;
			  
			  
			  while(rs.next())
	  {    
				 
				  
 //	     System.out.println("the "+count+"st item is : "); 
//			 System.out.println("The menu item id is:  "+rs.getString("m.item_id")); 
//				 System.out.println("The menu item name is:  "+rs.getString("m.item_name"));
//				 System.out.println("The menu price is:  "+rs.getString("m.item_price"));
//				 System.out.println("The menu price is:  "+rs.getBlob("m.item_image"));
				   m = new Menu_Item();
				 m.setItemId(rs.getInt("m.item_id"));
				 m.setItemName(rs.getString("m.item_name"));
				 m.setItemPrice(rs.getInt("m.item_price"));
				 m.setItemImage(rs.getString("m.item_image"));
				 m.setVendorId(rs.getInt("m.Vendor_id"));  
				  
		       aa.add(m);
		       count++;
				  
			  }
			  System.out.println("printing here itself");
			  for(int i=0;i<aa.size();i++)
			  {
				  System.out.println(aa.get(i).getItemId());
				  System.out.println(aa.get(i).getItemName());
			  }
			  
			  
				// aa.add(m);
			}
		  else if(b==3402)
		  { 
			  System.out.println("Welcome Indian");  
			  String sql = "Select m.item_id,m.item_name,m.item_price,m.item_image from Vendor v left join menu_item m on v.Vendor_id = m.Vendor_id where v.Vendor_id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
			  
				  ResultSet rs = ps.executeQuery();
				  int count=0;
				  while(rs.next())
				  {
//				   count++;
//				     System.out.println("the"+count+"st item is : "); 
//					 System.out.println("The menu item id is:  "+rs.getString("m.item_id")); 
//					 System.out.println("The menu item name is:  "+rs.getString("m.item_name"));
//					 System.out.println("The menu price is:  "+rs.getString("m.item_price"));
//					 
					  m = new Menu_Item();
					  m.setItemId(rs.getInt("m.item_id"));
						 m.setItemName(rs.getString("m.item_name"));
						 m.setItemPrice(rs.getInt("m.item_price"));
						 m.setItemImage(rs.getString("m.item_image"));
						   
						  
						 aa.add(m);
				  
				  }
				  
				  
		  }
		  else if(b==3403)
		  {
			  System.out.println("Welcome Mexican");
			  String sql = "Select m.item_id,m.item_name,m.item_price,m.item_image from Vendor v left join menu_item m on v.Vendor_id = m.Vendor_id where v.Vendor_id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				  ps.setInt(1, b);	
				  ResultSet rs = ps.executeQuery();
//				  int count=0;
				  while(rs.next())
				  {  
//					  count++;
//				     System.out.println("the"+count+"st item is : "); 
//					 System.out.println("The menu item id is:  "+rs.getString("m.item_id")); 
//					 System.out.println("The menu item name is:  "+rs.getString("m.item_name"));
//					 System.out.println("The menu price is:  "+rs.getString("m.item_price"));
				 m = new Menu_Item();
					  m.setItemId(rs.getInt("m.item_id"));
						 m.setItemName(rs.getString("m.item_name"));
						 m.setItemPrice(rs.getInt("m.item_price"));
						 m.setItemImage(rs.getString("m.item_image"));
						   
						  
						 aa.add(m);
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
		
		return aa;
	}

}
