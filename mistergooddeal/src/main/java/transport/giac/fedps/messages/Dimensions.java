package transport.giac.fedps.messages;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Dimensions {

	@XmlElement(required = true, name = "width")
	public int width;

	@XmlElement(required = true, name = "depth")
	public int depth;

	@XmlElement(required = true, name = "height")
	public int height;

}
