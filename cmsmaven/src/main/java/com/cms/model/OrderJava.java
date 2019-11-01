package com.cms.model;

public class OrderJava {
	
	private String OrderId;
	private	String  VendorId;
	private String MenuId;
	private String EmployeeId;
	private String Quantity;
	private String TotalPrice;
	private String TokenNo; 
    private String Stauts;
	private String Message;
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getVendorId() {
		return VendorId;
	}
	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}
	public String getMenuId() {
		return MenuId;
	}
	public void setMenuId(String menuId) {
		MenuId = menuId;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		TotalPrice = totalPrice;
	}
	public String getTokenNo() {
		return TokenNo;
	}
	public void setTokenNo(String tokenNo) {
		TokenNo = tokenNo;
	}
	public String getStauts() {
		return Stauts;
	}
	public void setStauts(String stauts) {
		Stauts = stauts;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmployeeId == null) ? 0 : EmployeeId.hashCode());
		result = prime * result + ((MenuId == null) ? 0 : MenuId.hashCode());
		result = prime * result + ((Message == null) ? 0 : Message.hashCode());
		result = prime * result + ((OrderId == null) ? 0 : OrderId.hashCode());
		result = prime * result + ((Quantity == null) ? 0 : Quantity.hashCode());
		result = prime * result + ((Stauts == null) ? 0 : Stauts.hashCode());
		result = prime * result + ((TokenNo == null) ? 0 : TokenNo.hashCode());
		result = prime * result + ((TotalPrice == null) ? 0 : TotalPrice.hashCode());
		result = prime * result + ((VendorId == null) ? 0 : VendorId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderJava other = (OrderJava) obj;
		if (EmployeeId == null) {
			if (other.EmployeeId != null)
				return false;
		} else if (!EmployeeId.equals(other.EmployeeId))
			return false;
		if (MenuId == null) {
			if (other.MenuId != null)
				return false;
		} else if (!MenuId.equals(other.MenuId))
			return false;
		if (Message == null) {
			if (other.Message != null)
				return false;
		} else if (!Message.equals(other.Message))
			return false;
		if (OrderId == null) {
			if (other.OrderId != null)
				return false;
		} else if (!OrderId.equals(other.OrderId))
			return false;
		if (Quantity == null) {
			if (other.Quantity != null)
				return false;
		} else if (!Quantity.equals(other.Quantity))
			return false;
		if (Stauts == null) {
			if (other.Stauts != null)
				return false;
		} else if (!Stauts.equals(other.Stauts))
			return false;
		if (TokenNo == null) {
			if (other.TokenNo != null)
				return false;
		} else if (!TokenNo.equals(other.TokenNo))
			return false;
		if (TotalPrice == null) {
			if (other.TotalPrice != null)
				return false;
		} else if (!TotalPrice.equals(other.TotalPrice))
			return false;
		if (VendorId == null) {
			if (other.VendorId != null)
				return false;
		} else if (!VendorId.equals(other.VendorId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderJava [OrderId=" + OrderId + ", VendorId=" + VendorId + ", MenuId=" + MenuId + ", EmployeeId="
				+ EmployeeId + ", Quantity=" + Quantity + ", TotalPrice=" + TotalPrice + ", TokenNo=" + TokenNo
				+ ", Stauts=" + Stauts + ", Message=" + Message + ", getOrderId()=" + getOrderId() + ", getVendorId()="
				+ getVendorId() + ", getMenuId()=" + getMenuId() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getQuantity()=" + getQuantity() + ", getTotalPrice()=" + getTotalPrice() + ", getTokenNo()="
				+ getTokenNo() + ", getStauts()=" + getStauts() + ", getMessage()=" + getMessage() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public OrderJava(String orderId, String vendorId, String menuId, String employeeId, String quantity,
			String totalPrice, String tokenNo, String stauts, String message) {
		super();
		this.OrderId = orderId;
		this.VendorId = vendorId;
		this.MenuId = menuId;
		this.EmployeeId = employeeId;
		this.Quantity = quantity;
		this.TotalPrice = totalPrice;
		this.TokenNo = tokenNo;
		this.Stauts = stauts;
		this.Message = message;
	}
	public OrderJava() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
