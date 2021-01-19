package worldOfJava;

import java.util.Random;
import java.util.Scanner;

public class Monde {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Cette m�thode fait combattre � tour de r�le le personnage et le monstre
     * @param personnage
     * @param monstre
     */
    public static void combat(Personnage personnage, Monstre monstre) {
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
    public static void quiGagne(Personnage personnage, Monstre monstre) {
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
        Personnage p = new Personnage(0, 0, "");

        // V�rifie que le nom n'est pas �gal � rien
        while(p.getNom().equals("")) {
            System.out.println("Saisir un nom :");
            p.setNom(scanner.next());
        }
        // V�rifie que les degats ne sont pas �gaux � 0
        while(p.getDegat() == 0) {
            System.out.println("Saisir les d�gats :");
            p.setDegat(scanner.nextInt());
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
    public static Monstre monstreFactory() {
		Scanner sc = new Scanner(System.in);
		String nom = genererNom();
		System.out.println("Saisir les d�gats du monstre: ");
		int degat = sc.nextInt();
		System.out.println("Saisir les points de vie du monstre: ");
		int pointDeVie = sc.nextInt();
		Monstre m1 = new Monstre(nom, degat, pointDeVie);
		System.out.println(m1);
		return m1;
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