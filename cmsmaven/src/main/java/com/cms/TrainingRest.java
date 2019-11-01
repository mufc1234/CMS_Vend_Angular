package com.cms;
import javax.ws.rs.GET;



import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.NotFoundException;

import javax.ws.rs.Path;

import javax.ws.rs.PathParam;

import javax.ws.rs.Produces;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

import com.cms.model.CombinedClass;
import com.cms.model.Menu_Item;
import com.cms.model.VendorJava;
import com.cms.service.AcceptingOrder;
import com.cms.service.AddingMenu;
import com.cms.service.Balancebeforechoosing;
import com.cms.service.CheckOrderHistory;
import com.cms.service.DeletingMenu;
import com.cms.service.EditingMenu;
import com.cms.service.GettingRequests;
import com.cms.service.RejectingOrder;
import com.cms.service.ViewVendorProfile;
import com.cms.service.ViewbyVendor;

@Path("/training")
public class TrainingRest {
    
	
	  @GET
	    @Produces(MediaType.APPLICATION_JSON)

	    public String display(){

	        System.out.println("GOODDD");

	        return "WELCOME U HERE";

	    }
	  
	  
	   @GET

	    @Path("{tid}")

	    @Produces(MediaType.APPLICATION_JSON)

	    public double trainingList(@PathParam("tid") int ti){

	        Balancebeforechoosing t=new Balancebeforechoosing();

	        double d=t.finduncheckedbalance(ti);

	        return d;

	    }

	 
	   
	   @GET
		  
	   @Path("tid/{tid1}")

	    @Produces(MediaType.APPLICATION_JSON)

	    public ArrayList<Menu_Item> trainingList1(@PathParam("tid1") int tid1){

	        ViewbyVendor t=new ViewbyVendor();

	        ArrayList<Menu_Item> d=t.viewDetails(tid1);
	        for(int i=0;i<d.size();i++)
	        {
	        	System.out.println("image is "+ d.get(i).getItemImage());
	        }

	        return d;

	    }
	
		   @GET
			  
		   @Path("prof/vend/{tid2}")

		    @Produces(MediaType.APPLICATION_JSON)

		    public ArrayList<VendorJava> profilelist(@PathParam("tid2") int tid2){

		        ViewVendorProfile t=new ViewVendorProfile();

		        ArrayList<VendorJava> d=t.viewprofile(tid2);

		        return d;

		    }
		
		   @GET
			  
		   @Path("hist/vend/check/{tid3}")

		    @Produces(MediaType.APPLICATION_JSON)

		    public ArrayList<CombinedClass> checkingorder(@PathParam("tid3") int tid3){

		        CheckOrderHistory t=new CheckOrderHistory();

		        ArrayList<CombinedClass> d=t.checkorder(tid3);
                
		         
		    
		        return d;

		    }
		   
		   
		   @PUT
		   @Path("wiiin/upd/{vendid}/{itid}/{itpr}/{itname}")
		   @Consumes(MediaType.APPLICATION_JSON)
           @Produces(MediaType.APPLICATION_JSON)
		   public ArrayList<Menu_Item> editnow(@PathParam("vendid") int vendid,@PathParam("itid") int itid,@PathParam("itpr") float itpr,@PathParam("itname") String itname)
		   {    
			   
			  
			   EditingMenu e = new EditingMenu();
 			   String res = e.EdittingMenuVend(itid,itpr,itname,vendid);
			   System.out.println(res);

 		        ViewbyVendor t=new ViewbyVendor();

 		        ArrayList<Menu_Item> f=t.viewDetails(vendid);
			   
			   
			   
			   
			   
			   return f;
		   }
		   
		   
		   
		   
		   @DELETE
			  
		   @Path("del/vend/{tid4}/{men_id}")
            
		    @Produces(MediaType.APPLICATION_JSON)

		    public String deleteorder(@PathParam("tid4") int tid4,@PathParam("men_id") int men_id){

			   DeletingMenu dm = new DeletingMenu();
			   String v = dm.DeletingMenuVend(men_id, tid4);
			   
//		        CheckOrderHistory t=new CheckOrderHistory();
//
//		        ArrayList<CombinedClass> d=t.checkorder(tid3);
//                
		         
		    
		        return v;

		    }
		   
		   
		   
		   
		   
		   
		   
		   
	   
		   @POST
			  
		   @Path("add/newvend/{tid5}")
		   @Consumes(MediaType.APPLICATION_JSON)
		    @Produces(MediaType.APPLICATION_JSON)

		    public ArrayList<Menu_Item> addorder(@PathParam("tid5") int tid5,Menu_Item i){
                
			   AddingMenu dm = new AddingMenu();
			   String v = dm.AddingMenuVend(i.getItemName(), i.getItemPrice(),tid5);
			   
//		        CheckOrderHistory t=new CheckOrderHistory();
//
//		        ArrayList<CombinedClass> d=t.checkorder(tid3);
//                 ViewbyVendor t=new ViewbyVendor();
		   ViewbyVendor t=new ViewbyVendor();
		        ArrayList<Menu_Item> f=t.viewDetails(tid5);
//		         
//		    
	        return f;
//
		    }
		   
		   
		   
		   
		   
		    @GET
			  
			   @Path("req/vend/check/{tid6}")

			    @Produces(MediaType.APPLICATION_JSON)

			    public ArrayList<CombinedClass> requestingorder(@PathParam("tid6") int tid6){
                    
		    	Balancebeforechoosing b = new Balancebeforechoosing();
	    	       b.finduncheckedbalance(tid6);
		    	
		    	  GettingRequests ge = new GettingRequests();
	    	        ArrayList<CombinedClass> ab = ge.getreq(tid6);
//	    	        Balancebeforechoosing b = new Balancebeforechoosing();
//    	       b.finduncheckedbalance(tid6);
			         
			    
			        return ab;

			    }
	   
	   
		       @PUT
			   @Path("accepting/req/check/{vendid}/{oid}")
			   @Consumes(MediaType.APPLICATION_JSON)
		       @Produces(MediaType.APPLICATION_JSON)
			   public void editnow(@PathParam("vendid") int vendid,@PathParam("oid") int oid)
			   {    
				   
				    System.out.println(oid);
				   AcceptingOrder a = new AcceptingOrder();
	 			   String res = a.acceptorder(oid);
	 			   
				   System.out.println(res);


				   
				   
				   
				   
				   
				 
			   }
		       
		       
			   @PUT
			   @Path("acc/req/check/high/{vending}")
			   @Consumes(MediaType.APPLICATION_JSON)
	           @Produces(MediaType.APPLICATION_JSON)
			   public void accepting(@PathParam("vending") int vending,CombinedClass c)
			   {    
				   
				  
				   AcceptingOrder a = new AcceptingOrder();
	 			   String res = a.acceptorder(Integer.parseInt(c.getVorder_id()));
				   System.out.println(res);

	 		        
				   
				   
				   
				   
				   
				   
			   }
		    
		      
		       
		       
		       
		       
		       
		       @DELETE
				  
			   @Path("newdel/vend/{tid8}/{oid1}")
	            
			    @Produces(MediaType.APPLICATION_JSON)

			    public void delord(@PathParam("tid8") int tid8,@PathParam("oid1") int oid1){
                       
		    	   System.out.println(oid1);
		    	   RejectingOrder r = new RejectingOrder();
		    	   r.rejectorder(oid1);
//			        CheckOrderHistory t=new CheckOrderHistory();
	//
//			        ArrayList<CombinedClass> d=t.checkorder(tid3);
//	                
			         
			    
			        

			    }
			   
		       
		       @GET
				  
			   @Path("check/bal/{tid9}")

			    @Produces(MediaType.APPLICATION_JSON)

			    public double checkbal(@PathParam("tid9") int tid9){
                    
		    	
		    	
		    	  Balancebeforechoosing be = new Balancebeforechoosing();
	    	        double ab = be.finduncheckedbalance(tid9);
	    	        System.out.println("Balance now is"+ab);
			         
			    
			        return ab;

			    }
	   
	   
	  
}
