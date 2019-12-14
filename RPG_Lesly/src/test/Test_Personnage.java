package test;

import armes.Arme;
import personnages.Archer;
import personnages.Guerrier;

public class Test_Personnage {

	public static void main(String[] args) {
		Arme epee = new Arme ("epee courte", 200);
		Arme arc = new Arme ("arc court", 150);
		Guerrier bob = new Guerrier("humain",100,200,epee);
		Archer dylan = new Archer ("elfe",200,100,arc);
		System.out.println(bob.getType() + " " +bob.getArme());
		System.out.println(dylan.toString());

	}

}
