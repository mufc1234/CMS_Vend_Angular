package com.cms.service;

import java.util.ArrayList;

import com.cms.connection.DisplayVendor;
import com.cms.model.Menu_Item;

public class ViewbyVendor {
	
	public ArrayList viewDetails(int n)
	{
	     
		DisplayVendor db = new DisplayVendor();	
		ArrayList<Menu_Item> b =db.displayselectedvend(n);
	    return b;
	}

}
