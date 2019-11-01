package com.cms.service;

import java.io.InputStream;

import com.cms.connection.AddMenuConnection;

public class AddingMenu {

	public String AddingMenuVend(String it_name,float it_price,int vend_id)

	{
		
	    AddMenuConnection am = new AddMenuConnection();
	     String res = am.addmenu(it_name,it_price,vend_id);
	     return res;
		
		
		
	}


}
