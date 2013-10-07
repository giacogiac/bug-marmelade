package crm.xingi;

import java.util.ArrayList;

import javax.jws.WebParam;
import javax.jws.WebService;

import crm.xingi.exceptions.CrmFault;
import crm.xingi.exceptions.LoginFault;
import crm.xingi.messages.*;

@WebService(endpointInterface = "crm.CrmService")
public class CrmServiceImpl implements CrmService {
	public String login(@WebParam(name = "login") String username,
			@WebParam(name = "pwd") String password) throws CrmFault {
		if (!(username.equals("guo") && (password.equals("archer"))))
			throw new LoginFault("LoginFault");
		return "a_secret_token-" + username;
	}

	public ArrayList<Product> orderProduct(String token, Product productOrdered) throws CrmFault {
		if (! token.equals("a_secret_token-guo"))
			throw new LoginFault("LoginFault");
		ArrayList<Product> OrderList = new ArrayList<Product>();
		OrderList.add(productOrdered);
		return OrderList;
	}
	
	public int exposeCatalogueOfCompany(ArrayList<Product> catalogueOfCompany) {
		for (int i = 0; i < catalogueOfCompany.size(); i++) {
			System.out.println("Product No." + i + " Name: "
					+ catalogueOfCompany.get(i).productName + " Category: "
					+ catalogueOfCompany.get(i).productCategory + " Reference: "
					+ catalogueOfCompany.get(i).reference);
		}
		return 0;
	}
}
