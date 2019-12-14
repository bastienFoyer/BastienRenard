package armes;

public class Arme {
	private String nom;
	private int durabilite;
	
	public Arme(String nom, int durabilite) {
		super();
		this.nom = nom;
		this.durabilite = durabilite;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDurabilite() {
		return durabilite;
	}
	public void setDurabilite(int durabilite) {
		this.durabilite = durabilite;
	}
	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Arme [nom=" + nom + ", durabilite=" + durabilite + "]";
	}	
	
}
