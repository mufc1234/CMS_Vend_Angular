package com.cms.model;

public class VendorJava {
	
	private String VendorId;
	private String VendorName;
	private String VendorEmail;
	private String VendorPhone;
	private String VendorUname;
	private String VendorPassword;
	private String VendorBalance;
	public String getVendorId() {
		return VendorId;
	}
	public void setVendorId(String vendorId) {
		VendorId = vendorId;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getVendorEmail() {
		return VendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		VendorEmail = vendorEmail;
	}
	public String getVendorPhone() {
		return VendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		VendorPhone = vendorPhone;
	}
	public String getVendorUname() {
		return VendorUname;
	}
	public void setVendorUname(String vendorUname) {
		VendorUname = vendorUname;
	}
	public String getVendorPassword() {
		return VendorPassword;
	}
	public void setVendorPassword(String vendorPassword) {
		VendorPassword = vendorPassword;
	}
	public String getVendorBalance() {
		return VendorBalance;
	}
	public void setVendorBalance(String vendorBalance) {
		VendorBalance = vendorBalance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((VendorBalance == null) ? 0 : VendorBalance.hashCode());
		result = prime * result + ((VendorEmail == null) ? 0 : VendorEmail.hashCode());
		result = prime * result + ((VendorId == null) ? 0 : VendorId.hashCode());
		result = prime * result + ((VendorName == null) ? 0 : VendorName.hashCode());
		result = prime * result + ((VendorPassword == null) ? 0 : VendorPassword.hashCode());
		result = prime * result + ((VendorPhone == null) ? 0 : VendorPhone.hashCode());
		result = prime * result + ((VendorUname == null) ? 0 : VendorUname.hashCode());
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
		VendorJava other = (VendorJava) obj;
		if (VendorBalance == null) {
			if (other.VendorBalance != null)
				return false;
		} else if (!VendorBalance.equals(other.VendorBalance))
			return false;
		if (VendorEmail == null) {
			if (other.VendorEmail != null)
				return false;
		} else if (!VendorEmail.equals(other.VendorEmail))
			return false;
		if (VendorId == null) {
			if (other.VendorId != null)
				return false;
		} else if (!VendorId.equals(other.VendorId))
			return false;
		if (VendorName == null) {
			if (other.VendorName != null)
				return false;
		} else if (!VendorName.equals(other.VendorName))
			return false;
		if (VendorPassword == null) {
			if (other.VendorPassword != null)
				return false;
		} else if (!VendorPassword.equals(other.VendorPassword))
			return false;
		if (VendorPhone == null) {
			if (other.VendorPhone != null)
				return false;
		} else if (!VendorPhone.equals(other.VendorPhone))
			return false;
		if (VendorUname == null) {
			if (other.VendorUname != null)
				return false;
		} else if (!VendorUname.equals(other.VendorUname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VendorJava [VendorId=" + VendorId + ", VendorName=" + VendorName + ", VendorEmail=" + VendorEmail
				+ ", VendorPhone=" + VendorPhone + ", VendorUname=" + VendorUname + ", VendorPassword=" + VendorPassword
				+ ", VendorBalance=" + VendorBalance + ", getVendorId()=" + getVendorId() + ", getVendorName()="
				+ getVendorName() + ", getVendorEmail()=" + getVendorEmail() + ", getVendorPhone()=" + getVendorPhone()
				+ ", getVendorUname()=" + getVendorUname() + ", getVendorPassword()=" + getVendorPassword()
				+ ", getVendorBalance()=" + getVendorBalance() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	public VendorJava(String vendorId, String vendorName, String vendorEmail, String vendorPhone, String vendorUname,
			String vendorPassword, String vendorBalance) {
		super();
		this.VendorId = vendorId;
		this.VendorName = vendorName;
		this.VendorEmail = vendorEmail;
		this.VendorPhone = vendorPhone;
		this.VendorUname = vendorUname;
		this.VendorPassword = vendorPassword;
		this.VendorBalance = vendorBalance;
	}
	public VendorJava() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
