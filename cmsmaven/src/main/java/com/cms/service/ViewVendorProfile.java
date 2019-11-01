package com.cms.service;

import java.util.ArrayList;

import com.cms.connection.DisplayVendorProfile;
import com.cms.model.VendorJava;

public class ViewVendorProfile {
   
	public ArrayList viewprofile(int v)
	
	{
		
		DisplayVendorProfile d= new DisplayVendorProfile();
		ArrayList<VendorJava> ac = d.dispvenprof(v);
		return ac;
		
	}
}
