package com.cms;

import java.io.File;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.cms.model.CombinedClass;
import com.cms.model.Menu_Item;
import com.cms.model.VendorJava;
import com.cms.service.AcceptingOrder;
import com.cms.service.AddingMenu;
import com.cms.service.Balancebeforechoosing;
import com.cms.service.DeletingMenu;
import com.cms.service.EditingMenu;
import com.cms.service.GettingRequests;
import com.cms.service.RejectingOrder;
import com.cms.service.ViewVendorProfile;
import com.cms.service.ViewbyVendor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {  
    	int n; char ch; int x;double avb;int adddel;int oid;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter one of the options from 1-4 to do the following in Vendor");
    	System.out.println(" 1. Press 1 for viewing menu ");
    	System.out.println(" 2. Press 2 for viewing profile");
    	System.out.println(" 3. Press 3 for add/delete/edit menu");
    	System.out.println(" 4. Press 4 for accept or reject offers");
    	System.out.println("5.press 5 to see the request page");
    	
    	n=sc.nextInt();
    	
    	
    	switch(n) {
    		case 1:
    			 int vid;
    			 
    			System.out.println("Please enter the VendorId");
         
         vid =sc.nextInt();
         ViewbyVendor v = new ViewbyVendor();
         ArrayList<Menu_Item> m=v.viewDetails(vid);
         
         System.out.println("the size of a list"+m.size());
         int count1=0;
          for (int i = 0; i < m.size(); i++)
          {   
          count1++;
          System.out.println("The item no "+count1+" is :");
            System.out.println("The name of item is "+m.get(i).getItemName());
            System.out.println("The id of item is "+m.get(i).getItemId());
            System.out.println("The price of item is "+m.get(i).getItemPrice());
            System.out.println("The image of item is "+m.get(i).getItemImage());
            System.out.println();
          }
         System.out.println("do you still want to continue. Press y or n");
         ch=sc.next().charAt(0);
         if(ch=='y' || ch=='Y')
         {
        	 App a = new App();
        	 a.main(null);
         }
         
         else {
        	 System.exit(0);
         }
         break;
    		
    		case 2:
    			int vd;
    			 
    			System.out.println("lets view our profile");
    			System.out.println("enter the vendor id");
    			  vd =sc.nextInt();
    			ViewVendorProfile vp = new ViewVendorProfile();
    			ArrayList<VendorJava> av = vp.viewprofile(vd);
    			int count2=0;
    			for(int j=0;j<av.size();j++)
    			{
    				count2++;
    		          System.out.println("The  vendor no "+count2+" is :");
    		            System.out.println("The id of vendor is "+av.get(j).getVendorId());
    		            System.out.println("The name of vendor is "+av.get(j).getVendorName());
    		            System.out.println("The email of vendor is "+av.get(j).getVendorEmail());
    		            System.out.println("The phone of vendor is "+av.get(j).getVendorPhone());
    		            System.out.println("The username of vendor is "+av.get(j).getVendorUname());
    		            System.out.println("The balance of vendor is "+av.get(j).getVendorBalance());
    		            System.out.println();
    			}
    			System.out.println("do you still want to continue. Press y or n");
    			 ch=sc.next().charAt(0);
    	         if(ch=='y' || ch=='Y')
    	         {
    	        	 App a = new App();
    	        	 a.main(null);
    	         }
    	         
    	         else {
    	        	 System.exit(0);
    	         }
    			break;
    			
    		case 3:
    			int vend_id,it_price,it_id;String it_name,in;
    			 String result1;int menu_id;
    			System.out.println("Welocome to add/del/edit page !!! Whats Cookin ");
    			System.out.println("\n");
    			System.out.println("Please enter a choice about what you want to do ");
    			System.out.println(" 10. Press 10 for adding a menu ");
    	    	System.out.println(" 20. Press 20 for deleting a menu");
    	    	System.out.println(" 30. Press 30 for editing a menu");
    			x=sc.nextInt();
    			
    			switch(x) {
    			case 10:
    			        System.out.println("Welcome to add menu page! What do u wanna add");
    			        System.out.println("Please enter the item name");
    			        it_name = sc.next();
    			        System.out.println("Please enter the item price");
    			        it_price = sc.nextInt();
    			       
    			     
    			        System.out.println("Please Enter the vendor_id");
    			        vend_id = sc.nextInt();
    			        
    			        
    			        
    			        
    			        
    			       AddingMenu am = new AddingMenu();
    			        result1 = am.AddingMenuVend(it_name, it_price,vend_id);
    			        System.out.println("finally "+result1);
    			        
    			        
    			        
    			        
    			        ViewbyVendor vi = new ViewbyVendor();
    			         ArrayList<Menu_Item> mi=vi.viewDetails(vend_id);
    			         
    			         System.out.println("the size of a list"+mi.size());
    			         int count3=0;
    			          for (int l = 0; l < mi.size(); l++)
    			          {   
    			          count3++;
    			          System.out.println("The item no "+count3+" is :");
    			            System.out.println("The name of item is "+mi.get(l).getItemName());
    			            System.out.println("The id of item is "+mi.get(l).getItemId());
    			            System.out.println("The price of item is "+mi.get(l).getItemPrice());
    			            System.out.println("The image of item is "+mi.get(l).getItemImage());
    			            System.out.println();
    			          }
    			         System.out.println("do you still want to continue. Press y or n");
    			         ch=sc.next().charAt(0);
    			         if(ch=='y' || ch=='Y')
    			         {
    			        	 App a = new App();
    			        	 a.main(null);
    			         }
    			         
    			         else {
    			        	 System.exit(0);
    			         }
    			         break;
    			         
    			       
    			case 20:
    			
    				System.out.println("Welcome to Delete menu page! What do u wanna delete");
    				  System.out.println("Please enter the menu id");
  			        menu_id = sc.nextInt();
			        System.out.println("Please enter the vendor id");
  			        vend_id = sc.nextInt();
    				
  			      DeletingMenu dm = new DeletingMenu();
  			  String result12 = dm.DeletingMenuVend(menu_id,vend_id);
  			  System.out.println("finally "+result12);
  			  
  			 ViewbyVendor vie = new ViewbyVendor();
	         ArrayList<Menu_Item> mib=vie.viewDetails(vend_id);
	         
	         System.out.println("the size of a list"+mib.size());
	         int count4=0;
	          for (int k = 0; k < mib.size(); k++)
	          {   
	          count4++;
	          System.out.println("The item no "+count4+" is :");
	            System.out.println("The name of item is "+mib.get(k).getItemName());
	            System.out.println("The id of item is "+mib.get(k).getItemId());
	            System.out.println("The price of item is "+mib.get(k).getItemPrice());
	            System.out.println("The image of item is "+mib.get(k).getItemImage());
	            System.out.println();
	          }
	         System.out.println("do you still want to continue. Press y or n");
	         ch=sc.next().charAt(0);
	         if(ch=='y' || ch=='Y')
	         {
	        	 App a = new App();
	        	 a.main(null);
	         }
	         
	         else {
	        	 System.exit(0);
	         }
	        
	         break;
  			  
    			
    			
    				
    			case 30:
    				float new_price;String new_image;int vendor_id;String menu_name;
    				System.out.println("Welcome to Edit menu page! What do u wanna Edit");
  				 
    				 System.out.println("Please enter the vendorId");
 			        vendor_id = sc.nextInt();
    				System.out.println("Please enter the menu id");
			        menu_id = sc.nextInt();
			        System.out.println("Please enter the newprice");
			        new_price = sc.nextFloat();
			        System.out.println("Please enter the newimage");
			        new_image = sc.next();
//			        System.out.println("Please enter the vendor id");
//			        vend_id = sc.nextInt();
			        System.out.println("Please enter the menu name");
			        menu_name = sc.next();
  				System.out.println();
			      EditingMenu em = new EditingMenu();
			  String  result123 = em.EdittingMenuVend(menu_id,new_price,menu_name,vendor_id);
			 
			 ViewbyVendor vied = new ViewbyVendor();
	         ArrayList<Menu_Item> mibs=vied.viewDetails(vendor_id);
	         
	        
	         int count5=0;
	          for (int k = 0; k < mibs.size(); k++)
	          {   
	          count5++;
	          System.out.println("The item no "+count5+" is :");
	            System.out.println("The name of item is "+mibs.get(k).getItemName());
	            System.out.println("The id of item is "+mibs.get(k).getItemId());
	            System.out.println("The price of item is "+mibs.get(k).getItemPrice());
	            System.out.println("The image of item is "+mibs.get(k).getItemImage());
	            System.out.println();
	          }
	         System.out.println("do you still want to continue. Press y or n");
	         ch=sc.next().charAt(0);
	         if(ch=='y' || ch=='Y')
	         {
	        	 App a = new App();
	        	 a.main(null);
	         }
	         
	         else {
	        	 System.exit(0);
	         }
    				
    				
    				
    			      
    				break;
    				
    			default:
        			System.out.println("pls enter a proper no");
        			App a = new App();
        			a.main(null);
        			break;
    				
    			}
    				break;
    		case 4:
    			
    			System.out.println("Welcome to add or delete page");
    			System.out.println("enter the vendor id");
    			  vd =sc.nextInt();
    			  Balancebeforechoosing vbu = new Balancebeforechoosing();
    			 avb = vbu.finduncheckedbalance(vd);
    			 
    			 System.out.println();
    			 System.out.println("The total balance by ordering and not by accepting or rejecting is :"+avb);
    			 
    			 System.out.println();
    		do {	 
    			 System.out.println("what do wanna do now? Accept or Reject");
    			 System.out.println("1. Choose 100 to accept ");
    			 System.out.println("2. Choose 200 to reject ");
    			 
    			 adddel=sc.nextInt();
    		 switch(adddel) {case 100:
    			       
    			  System.out.println("lets accept the offer now");
    			   System.out.println("Please enter the orderid correctly :");
    			   oid=sc.nextInt();
    			   
    			   AcceptingOrder ao = new AcceptingOrder();
    			   String sb = ao.acceptorder(oid);
    			   System.out.println();
    			   System.out.println(sb);
   			      break;
   			      
    		  case 200:
    			  
    			  
    			  System.out.println("lets reject the offer now");
   			   System.out.println("Please enter the orderid correctly :");
   			   oid=sc.nextInt();
   			   
   			   RejectingOrder ro = new RejectingOrder();
   			   Double skl = ro.rejectorder(oid);
   			   System.out.println();
   			   System.out.println("The balance now in wallet is : ");
   			   System.out.println(skl);
    			  
    			  
    		  break;
    		          
    		    default:    		    	
    		    	System.out.println("Pls add the correct option! go to the main menu now");
    		    	App a = new App();
        			a.main(null);
        			break;
    		    	}}while(adddel!=100 || adddel!=200);
    		    		
    	  //  			 int count2=0;
//    			for(int j=0;j<av.size();j++)
//    			{
//    				count2++;
//    		          System.out.println("The  vendor no "+count2+" is :");
//    		            System.out.println("The id of vendor is "+av.get(j).getVendorId());
//    		            System.out.println("The name of vendor is "+av.get(j).getVendorName());
//    		            System.out.println("The email of vendor is "+av.get(j).getVendorEmail());
//    		            System.out.println("The phone of vendor is "+av.get(j).getVendorPhone());
//    		            System.out.println("The username of vendor is "+av.get(j).getVendorUname());
//    		            System.out.println("The balance of vendor is "+av.get(j).getVendorBalance());
//    		            System.out.println();
//    			}
    			System.out.println("do you still want to continue. Press y or n");
    			 ch=sc.next().charAt(0);
    	         if(ch=='y' || ch=='Y')
    	         {
    	        	 App a = new App();
    	        	 a.main(null);
    	         }
    	         
    	         else {
    	        	 System.exit(0);
    	         }
    			break;
                			
    		case 5:
    			int vend;
    			System.out.println("just to see the request page");
    			System.out.println("please enter the vendor id");
    	        vend=sc.nextInt();
    		    GettingRequests ge = new GettingRequests();
    	        ArrayList<CombinedClass> ab = ge.getreq(vend);
    	        int count6=0;
  	          for (int k = 0; k < ab.size(); k++)
  	          {   
  	          count6++;
  	          System.out.println("The item no "+count6+" is :");
  	            System.out.println("The order id is "+ab.get(k).getVorder_id());
  	            System.out.println("The username is "+ab.get(k).getVuser_name());
  	            System.out.println("The userid is "+ab.get(k).getVuser_id());
  	            System.out.println("The name of item is "+ab.get(k).getVitem_name());
  	          System.out.println("The total price is "+ab.get(k).getvTotalprice());
  	        System.out.println("The quantity is "+ab.get(k).getVquantity());
  	            System.out.println();
  	          }
    	        
    		default:
    			System.out.println("pls enter a proper no");
    			App a = new App();
    			a.main(null);
    			break;
    	}
    	
    	}
   
}
