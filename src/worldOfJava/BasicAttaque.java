package worldOfJava;

public class BasicAttaque implements IAttaque {

	public int degats;
	public double chanceToucher;
	
	public basicAttaque(int degats, double chanceToucher)
	{
		this.degats = degats;
		this.chanceToucher = chanceToucher;
		
	}

	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNom() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public int getChanceToucher() {
		return 0;
	}

	@Override
	public void setNom(String nom) {
	}

	@Override
	public void setDescription(int description) {
	}

	@Override
	public void setChanceToucher(double chanceToucher) {
	}

	public int lancerAttaque(ICombattant lanceur, ICombattant cible)
	{
		// Avec un nombre aleatoire random compris entre 0 et 100
		int x = 0 + (int)(Math.random() * ((100 - 0) + 1));
		// si random < chanceToucher
		if (x < getChanceToucher() ) {
			return lanceur.getDegat();
		}
		else {
			System.out.println("Votre attaque à échoué !");
			return 0;
			
		}
		// retourner lanceur.Degats
		// sinon renvoyer 0 et afficher un message d'echec
	}
}
