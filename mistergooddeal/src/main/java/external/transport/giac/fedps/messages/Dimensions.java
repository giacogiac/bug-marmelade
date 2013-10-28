package external.transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Dimensions {

	@XmlElement(required = true)
	public int width;

	@XmlElement(required = true)
	public int depth;

	@XmlElement(required = true)
	public int height;

}
