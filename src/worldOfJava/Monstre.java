package worldOfJava;

public class Monstre extends AbstractCombattant {
	
	// D�finition de la m�thode monstre qui aura les m�mes caract�ristique qu'un combattant.
	
	public Monstre (int pointDeVie, int degat, String nom, int QspellCd) {
		super(nom, degat, pointDeVie, QspellCd);
	}

}
