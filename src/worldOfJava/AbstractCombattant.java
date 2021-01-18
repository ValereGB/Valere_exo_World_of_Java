package worldOfJava;

public abstract class AbstractCombattant {
	/**
	 * Définition des variables qui représenteront les statistiques du combattant
	 */
	public String nom;
	public int pointDeVie;
	public int degat;
	public int QspellCd;

	public AbstractCombattant() {}
	
	/**
	 * Mise en place du constructeur de la classe mère
	 * @param pointDeVie
	 * @param degat
	 * @param nom
	 * @param QspellCd
	 */
	public AbstractCombattant(String nom, int pointDeVie, int degat, int QspellCd){
		super();
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
		this.QspellCd = QspellCd;
	}

	/**
	 * Mise en place des getters et setters
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

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

	public int getQspellCd() {
		return QspellCd;
	}
	public void setQspellCd(int qspellCd) {
		QspellCd = qspellCd;
	}

}