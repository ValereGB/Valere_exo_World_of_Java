package worldOfJava;

public class Monstre extends AbstractCombattant {
	
	// Définition de la méthode monstre qui aura les mêmes caractéristique qu'un combattant.
	
	public Monstre (int pointDeVie, int degat, String nom, int QspellCd) {
		super(nom, degat, pointDeVie, QspellCd);
	}

}
