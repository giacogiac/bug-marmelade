package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

import java.util.Date;

@XmlType(name="ResponseTrack")
public class TrackResponse {

	public String location;

	public Date edd;

}
