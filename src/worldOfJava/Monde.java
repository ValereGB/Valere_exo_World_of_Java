package worldOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Monde {
	
	private static String[] Classe;

    static Scanner scanner = new Scanner(System.in);

    public static Classe GetClasse(String nom)
    {
       return null; //La classe avec le nom : "nom"
    }
    
    
    
    /**
     * Cette m�thode fait combattre � tour de r�le le personnage et le monstre
     * @param personnage
     * @param monstre
     */
    public static void combat(ICombattant personnage, ICombattant monstre) {
        int tour = 1;
        boolean isTurn = true;

        while (personnage.getPointDeVie() > 0 && monstre.getPointDeVie() > 0) {
            System.out.println("------- TOUR " + tour + " -------");
            if (isTurn) {
                personnage.attaquer(monstre);
            } else {
                monstre.attaquer(personnage);
            }
            isTurn = !isTurn;
            tour++;
            scanner.nextLine();
        }

        quiGagne(personnage, monstre);
    }

    /**
     * M�thode qui affiche le r�sultat du combat
     * @param personnage
     * @param monstre
     */
    public static void quiGagne(ICombattant personnage, ICombattant monstre) {
        if (personnage.getPointDeVie() > 0) {
            System.out.println(personnage.getNom() + " a gagn� !");
        } else {
            System.out.println(monstre.getNom() + " a gagn� !");
        }
    }

    /**
     * Cette m�thode cr�er et retourne un personnage
     * @return
     */
    public static Personnage PersonnageFactory() {
        //Nouveau Personnage
        Personnage p = new Personnage("", 0, 0, classeFactory());
        System.out.println("Cr�ation d'un personnage ---------");

        // V�rifie que le nom n'est pas �gal � rien
        while(p.getNom().equals("")) {
            System.out.println("Saisir un nom :");
            p.setNom(scanner.next());
        }
        // V�rifie que les degats ne sont pas �gaux � 0
        while(p.getDegats() == 0) {
            System.out.println("Saisir les d�gats :");
            p.setDegats(scanner.nextInt());
        }
        // V�rifie que les points de vie ne sont pas �gaux � 0
        while(p.getPointDeVie() == 0) {
            System.out.println("Saisir les points de vie :");
            p.setPointDeVie(scanner.nextInt());
        }
        return p;
    }

    /**
     * Cette m�thode cr�er et retourne un monstre
     * @return
     */
    public static Monstre MonstreFactory() {
        Monstre m = new Monstre(genererNom(), 5, 50);
        return m;
    }

    /**
     * Cette m�thode cr�er et retourne une BasicAttaque
     * @return
     */
    public static BasicAttaque basicAttaqueFactory() {
        System.out.println("Cr�ation d'un attaque ---------");
        BasicAttaque a = new BasicAttaque("", "Ceci est une attaque", 10, 50);
        System.out.println("Nom :");
        a.setNom(scanner.next());
        return a;
    }

    /**
     * Cette m�thode cr�er et retourne une classe
     * @return
     */
    public static Classe classeFactory() {
        System.out.println("Cr�ation d'une classe ----------");
        Classe c = new Classe();
        System.out.println("Nom :");
        c.setNom(scanner.next());

        // Cr�ation d'une liste d'attaque pour la classe
        List<IAttaque> attaques = new ArrayList<>();
        attaques.add(basicAttaqueFactory());
        attaques.add(basicAttaqueFactory());

        c.setAttaques(attaques);

        return c;
    }

    /**
     * Cette m�thode g�n�re un nom al�atoire
     * @return
     */
    public static String genererNom() {
        //Tableaux de noms
        String[] debutNom = new String[]{"chat","chien","chaton"};
        String[] finNom = new String[]{" mechant"," de feu"," de la mort"};

        //Construction du nom assembl�
        Random random = new Random();
        String debut = debutNom[random.nextInt(debutNom.length)];
        String fin = finNom[random.nextInt(finNom.length)];
        String str = debut + fin;
        return str;
    }

    /**
     * Cette m�thode affiche les informations du monde
     */
    public static void afficherInformations()
    {
        // TODO
    }

}
