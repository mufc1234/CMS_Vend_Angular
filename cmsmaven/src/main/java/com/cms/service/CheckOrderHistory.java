package com.cms.service;

import java.util.ArrayList;

import com.cms.connection.DisplayVendor;
import com.cms.connection.OrderConnection;
import com.cms.model.CombinedClass;
import com.cms.model.Menu_Item;

public class CheckOrderHistory {

	
	public ArrayList checkorder(int n)
	{
	     
		OrderConnection db = new OrderConnection();	
		ArrayList<CombinedClass> b =db.ViewOrder(n);
	    return b;
	    
	    
	}

	
}
