package worldOfJava;

/**
 * Classe Personnage qui h�rite de abstractCombattant et qui aura donc les m�mes choix de stats
 * @author ValouLeLoup
 *
 */
public class Personnage extends AbstractCombattant{

  private Classe classe;

  public Personnage() {
      super();
  }

  public Personnage(String nom, int degats, int pointDeVie, Classe classe) {
      super(nom, degats, pointDeVie);
      // Equivalant � :
      // new AbstractCombattant(nom, degats, pointDeVie);
      this.classe = classe;
  }

  /**
   * Cette m�thode utiliser la m�thode lancerAttaque() pour attaquer un adversaire
   * @param adversaire
   */
  @Override
  public void attaquer(ICombattant adversaire) {
      System.out.println(this.getNom() + " attaque " + adversaire.getNom());
      adversaire.defendre(this.classe.getAttaque().lancerAttaque());
      System.out.println("Il reste � " + adversaire.getNom() + " : " + adversaire.getPointDeVie() + " pdv");
  }
}
