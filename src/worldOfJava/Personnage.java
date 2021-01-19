package worldOfJava;


public class Personnage extends AbstractCombattant {

	public Personnage() {
		super();	
	}

	/**
	 * Mise en place du constructeur
	 * @param pointDeVie
	 * @param degat
	 * @param nom
	 * @param QspellCd
	 */
	public Personnage(int pointDeVie, int degat, String nom) {
		super(nom , pointDeVie, degat);
	}
	/**
	 * Affichage du personnage
	 */
	@Override
	public String toString() {
		return "Le personnage " + this.nom + " à " + this.pointDeVie + " points de vie et une moyenne de " + this.degat + " dégats de base. Bonne chance. \n ";
	}

	





}
