package com.cms.service;

import com.cms.connection.AcceptingConnection;
import com.cms.connection.RejectingConnection;

public class RejectingOrder {

	public double rejectorder(int oid)
	{
		RejectingConnection ac = new RejectingConnection();
		Double vv = ac.rejectconnection(oid);
		
		return vv; 
	}

}

