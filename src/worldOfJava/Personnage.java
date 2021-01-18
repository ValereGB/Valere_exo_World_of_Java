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
	public Personnage(int pointDeVie, int degat, String nom, int QspellCd) {
		super(nom , degat, pointDeVie, QspellCd);
	}

	/**
	 * Mise en place des getters et setters
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getDegat() {
		return degat;
	}
	public void setDegat(int degat) {
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQspellCd() {
		return QspellCd;
	}
	public void setQspellCd(int qspellCd) {
		QspellCd = qspellCd;
	}
	/**
	 * Affichage du personnage
	 */
	@Override
	public String toString() {
		return "Le personnage " + this.nom + " à " + this.pointDeVie + " points de vie et une moyenne de " + this.degat + " dégats de base,"
				+ " de plus le cd de son sort Q est de  " + this.QspellCd + " secondes. Bonne chance.";
	}


	
	

}
