package com.cms.service;

import java.util.ArrayList;

import com.cms.connection.DisplayVendorProfile;
import com.cms.connection.Gettheorders;
import com.cms.model.CombinedClass;
import com.cms.model.VendorJava;

public class GettingRequests {

	
	public ArrayList getreq(int vendid)
	{
		Gettheorders d= new Gettheorders();
		ArrayList<CombinedClass> ac = d.gettingorderreq(vendid);
		return ac;
		
		
	
	}
}
