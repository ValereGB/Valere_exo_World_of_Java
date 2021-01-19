package worldOfJava;

public abstract class AbstractCombattant implements ICombattant {
	/**
	 * Définition des variables qui représenteront les statistiques du combattant
	 */
	public String nom;
	public int pointDeVie;
	public int degat;

	public AbstractCombattant() {}

	/**
	 * Mise en place du constructeur de la classe mère
	 * @param pointDeVie
	 * @param degat
	 * @param nom
	 * @param QspellCd
	 */
	public AbstractCombattant(String nom, int pointDeVie, int degat){
		super();
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
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

	
	@Override
	public void attaquer(ICombattant adversaire) {
		System.out.println("Votre attaque inflige "+this.getDegat()+" points de dégats.");
		adversaire.defendre(this.getDegat());
		System.out.println("Au tour de l'ennemi !");
		
	}

	@Override
	public void defendre(int degat) {
		this.setPointDeVie(this.getPointDeVie()-degat);
		
	}
	
	
    @Override
    public String toString() {
        return "AbstractCombattant{" +
                "nom='" + nom + '\'' +
                ", degat=" + degat +
                ", pointDeVie=" + pointDeVie +
                '}';
    }
	

}