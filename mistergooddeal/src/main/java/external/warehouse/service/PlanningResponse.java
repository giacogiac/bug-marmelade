package external.warehouse.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="PlanningResp")
public class PlanningResponse {
	
	@XmlElement(required=true, name="planning")
	public String planning;
	
}
