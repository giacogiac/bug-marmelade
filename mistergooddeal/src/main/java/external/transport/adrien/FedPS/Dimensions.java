package external.transport.adrien.FedPS;

public class Dimensions {
	private float hauteur;
	private float largeur;
	private float longueur;
	
	public Dimensions() {
		hauteur = 0;
		largeur = 0;
		longueur = 0;
	}
	
	public Dimensions(float h, float la, float lon) {
		hauteur = h;
		largeur = la;
		longueur = lon;
	}
	
	public float getVolume() {
		return hauteur*largeur*longueur;
	}
	
	public float getHauteur() {
		return hauteur;
	}
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	
	
}
