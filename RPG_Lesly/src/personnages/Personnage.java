package personnages;
import armes.Arme;

public abstract class Personnage {
	private String race;
	private int pa;
	private int pd;
	private Arme arme;
	
	public Personnage(String type, int pa, int pd, Arme arme) {
		this.race=type;
		this.pa=pa;
		this.pd=pd;
		this.arme=arme;
		
	}
	
	public String getType() {
		return race;
	}
	
	public void setType(String newtype) {
		this.race = newtype;
	}

	public int getPa() {
		return pa;
	}

	public void setPa(int pa) {
		this.pa = pa;
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
	
}