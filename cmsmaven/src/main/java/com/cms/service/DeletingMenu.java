package com.cms.service;

import com.cms.connection.AddMenuConnection;
import com.cms.connection.DeleteMenuConnection;

public class DeletingMenu {
 
	public String DeletingMenuVend(int men_id,int vendid)
	{
		DeleteMenuConnection am = new DeleteMenuConnection();
	     String res = am.deletemenu(men_id,vendid);
	     return res;
		
		
		
	}
}
