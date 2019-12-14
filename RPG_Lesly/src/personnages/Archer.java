package personnages;
import armes.Arme;

public class Archer extends Personnage{

	public Archer(String race, int pa, int pd, Arme arme) {
		super(race, pa, pd, arme);

	}

	@Override
	public String toString() {
		return "Acher : Type " + getType() + ", points d'attaque : " + getPa() + ", points de défense : " + getPd() + ", armes : "
				+ getArme().toString();
	}

}
