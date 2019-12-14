package personnages;
import armes.Arme;

public class Guerrier extends Personnage{
	
	private Arme arme2;
	
	public Guerrier(String race, int pa, int pd, Arme arme) {
		super(race, pa, pd, arme);
	}
	
	/**
	 * 
	 * @param race
	 * @param pa
	 * @param pd
	 * @param arme
	 * @param arme2
	 */
	public Guerrier(String race, int pa, int pd, Arme arme, Arme arme2) {
		super(race, pa, pd, arme);
		this.arme2=arme2;
	}

	@Override
	public String toString() {
		return "Guerrier : Type " + getType() + ", points d'attaque : " + getPa() + ", points de défense : " + getPd() + ", armes : "
				+ getArme().toString();
	}

	public Arme getArme2() {
		return arme2;
	}

	public void setArme2(Arme arme2) {
		this.arme2 = arme2;
	}
	
	
}