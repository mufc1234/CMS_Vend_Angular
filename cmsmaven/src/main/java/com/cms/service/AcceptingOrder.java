package com.cms.service;

import com.cms.connection.AcceptingConnection;

public class AcceptingOrder {

	
	public String acceptorder(int oid)
	{
		AcceptingConnection ac = new AcceptingConnection();
		String vv = ac.acceptconnection(oid);
		
		return vv; 
	}
}
