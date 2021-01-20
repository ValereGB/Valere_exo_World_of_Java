package worldOfJava;

/**
 * Classe monstre qui hérite de abstractCombattant et qui aura donc les mêmes choix de stats
 * @author ValouLeLoup
 *
 */

public class Monstre extends AbstractCombattant {

    public Monstre() {
        super();
    }

    public Monstre(String nom, int degats, int pointDeVie) {
        super(nom, degats, pointDeVie);
    }
}
