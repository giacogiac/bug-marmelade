package crm.xingi.messages;

import javax.xml.bind.annotation.*;

import java.util.ArrayList;

@XmlType(name="CustomerAccount")
public class CustomerAccount {
	@XmlElement(required=true, name="login")
	public String login;
	
	@XmlElement(required=true, name="pwd")
	public String pwd;
	
	@XmlElement(required=true, name="deliveryAdress")
	public String deliveryAdress;
	
	@XmlElement(required=true, name="listOfPrefferedProducts")
	public ArrayList<Product> listOfPrefferedProducts;
}
