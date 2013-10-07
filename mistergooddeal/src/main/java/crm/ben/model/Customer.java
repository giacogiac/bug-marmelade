package crm.ben.model;


public class Customer {
	
	
	private long id;
	private String name;
	private String password;
	private String mail;
	private String familyName;
	private String deliveryAdress;
	private String billingAdress;
	private String phone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(String deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	public String getBillingAdress() {
		return billingAdress;
	}
	public void setBillingAdress(String billingAdress) {
		this.billingAdress = billingAdress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Customer)obj).id==(this.id);
	}

}
