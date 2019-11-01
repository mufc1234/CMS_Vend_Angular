package com.cms.service;

import com.cms.connection.UncheckBalConnection;

public class Balancebeforechoosing {

	public double finduncheckedbalance(int ven_id)
	{
		UncheckBalConnection u = new UncheckBalConnection();
		
		double v = u.findingubal(ven_id);
		
		
		return v;
	}
	
	
}
