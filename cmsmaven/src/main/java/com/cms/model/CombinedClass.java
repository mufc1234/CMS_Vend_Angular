package com.cms.model;

public class CombinedClass {


private String vuser_name;
private String vorder_id;
private String vuser_id;

private String vquantity;
private String vTotalprice;
private String vitem_name;
public CombinedClass() {
	super();
	// TODO Auto-generated constructor stub
}
public CombinedClass(String vuser_name, String vorder_id, String vuser_id, String vquantity, String vTotalprice,
		String vitem_name) {
	super();
	this.vuser_name = vuser_name;
	this.vorder_id = vorder_id;
	this.vuser_id = vuser_id;
	this.vquantity = vquantity;
	this.vTotalprice = vTotalprice;
	this.vitem_name = vitem_name;
}

     

 public CombinedClass(CombinedClass c)
 {
	 setVorder_id(c.vorder_id);
	 
 }


@Override
public String toString() {
	return "CombinedClass [vuser_name=" + vuser_name + ", vorder_id=" + vorder_id + ", vuser_id=" + vuser_id
			+ ", vquantity=" + vquantity + ", vTotalprice=" + vTotalprice + ", vitem_name=" + vitem_name
			+ ", getVuser_name()=" + getVuser_name() + ", getVorder_id()=" + getVorder_id() + ", getVuser_id()="
			+ getVuser_id() + ", getVquantity()=" + getVquantity() + ", getvTotalprice()=" + getvTotalprice()
			+ ", getVitem_name()=" + getVitem_name() + "]";
}

public String getVuser_name() {
	return vuser_name;
}
public void setVuser_name(String vuser_name) {
	this.vuser_name = vuser_name;
}
public String getVorder_id() {
	return vorder_id;
}
public void setVorder_id(String vorder_id) {
	this.vorder_id = vorder_id;
}
public String getVuser_id() {
	return vuser_id;
}
public void setVuser_id(String vuser_id) {
	this.vuser_id = vuser_id;
}
public String getVquantity() {
	return vquantity;
}
public void setVquantity(String vquantity) {
	this.vquantity = vquantity;
}
public String getvTotalprice() {
	return vTotalprice;
}
public void setvTotalprice(String vTotalprice) {
	this.vTotalprice = vTotalprice;
}
public String getVitem_name() {
	return vitem_name;
}
public void setVitem_name(String vitem_name) {
	this.vitem_name = vitem_name;
}
}
