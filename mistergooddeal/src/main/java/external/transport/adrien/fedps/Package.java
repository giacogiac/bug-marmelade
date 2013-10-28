package external.transport.adrien.fedps;

public class Package {
	
	private int poids;
	private Dimensions dimension;
	private String source;
	private String destination;
	
	public Package() {
		poids = 0;
		dimension = new Dimensions();
		source = "";
		destination = "";
	}
	
	public Package(int p, Dimensions dim, String s, String dest) {
		poids = p;
		dimension = dim;
		source = s;
		destination = dest;
	}
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public Dimensions getDimension() {
		return dimension;
	}
	public void setDimension(Dimensions dimension) {
		this.dimension = dimension;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
