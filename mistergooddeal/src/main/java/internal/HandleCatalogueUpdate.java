package internal;

/**@author ThaiHa **/

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

// interface pour update catalogue
@WebService(name = "CatalogueUpdate")
public interface HandleCatalogueUpdate {
	@WebResult(name = "result")
	public String catalogueUpdate();
}
