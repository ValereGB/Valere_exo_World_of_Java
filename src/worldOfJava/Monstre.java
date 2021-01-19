package worldOfJava;

public class Monstre extends AbstractCombattant {

	public Monstre() {
		super();	
	}

	/**
	 * Mise en place du constructeur
	 * @param nom
	 * @param degat
	 * @param pointDeVie
	 * @param QspellCd
	 */
	public Monstre (String nom, int degat, int pointDeVie) {
		super(nom, pointDeVie, degat);
	}
	
	@Override
	public String toString() {
		return "Le monstre " + this.nom + " à " + this.pointDeVie + " points de vie et une moyenne de " + this.degat + " dégats de base. \n";
	}




}
