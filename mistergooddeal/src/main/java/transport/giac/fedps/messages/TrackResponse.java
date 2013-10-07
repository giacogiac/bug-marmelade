package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

import java.util.Date;

@XmlType(name = "TrackResponse")
public class TrackResponse {

	@XmlElement(required = true, name = "location")
	public String location;

	@XmlElement(required = true, name = "edd")
	public Date edd;

}
