package com.cms.service;

import com.cms.connection.DeleteMenuConnection;
import com.cms.connection.EditMenuConnection;

public class EditingMenu {

	public String EdittingMenuVend(int men_id,float new_price,String new_name,int vendo_id)
	{
		EditMenuConnection ems = new EditMenuConnection();
	     String res = ems.editmenu(men_id,new_price,new_name,vendo_id);
	     return res;
		
		
		
	}
}
