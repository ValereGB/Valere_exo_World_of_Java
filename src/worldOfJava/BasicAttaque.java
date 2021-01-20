package worldOfJava;

import java.util.Random;

public class BasicAttaque implements IAttaque{

    private String nom;
    private String description;
    private int degats;
    private double chanceToucher;

    public BasicAttaque() {
    }

    public BasicAttaque(String nom, String description, int degats, double chanceToucher) {
        this.nom = nom;
        this.description = description;
        this.degats = degats;
        this.chanceToucher = chanceToucher;
    }

    /**
     * Cette m�thode g�n�re un nombre al�atoire entre 0 et 100
     * Si ce nombre est inf�rieur � la chance de toucher, retourne les degats
     * Sinon affiche une erreur et retourn 0
     * @return
     */
    public int lancerAttaque() {
        Random random = new Random();
        // G�n�re un nombre al�atoire � virgule entre 0 et 100
        double nbr = random.nextDouble() * 100;

        if(nbr < getChanceToucher()) {
            return getDegats();
        } else {
            System.out.println("L'attaque a �chou�");
        }

        return 0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getDegats() {
        return degats;
    }

    @Override
    public void setDegats(int degats) {
        this.degats = degats;
    }

    @Override
    public double getChanceToucher() {
        return chanceToucher;
    }

    /**
     * Calcul des chances de toucher pour le personnage afin de cr�er une situation d'�chec d'attaque ou non
     */
    @Override
    public void setChanceToucher(double chanceToucher) {
        if(chanceToucher >= 0 && chanceToucher <= 100) {
            this.chanceToucher = chanceToucher;
        } else {
            System.out.println("La chance de toucher doit �tre comprise entre 0 et 100");
        }
    }
}
