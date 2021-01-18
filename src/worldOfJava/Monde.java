package worldOfJava;

import java.util.Random;
import java.util.Scanner;

public class Monde {
	/**
	 * Definition principal d'un personnage au choix.
	 * @return
	 */
	public static Personnage personnageFactory() {
		// Demander a l'utilisateur un nom de personnage
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nom du personnage: ");
		String nom = sc.nextLine();
		System.out.println("Saisir les d�gats du personnage: ");
		int degat = sc.nextInt();
		System.out.println("Saisir les points de vie du personnage: ");
		int pointDeVie = sc.nextInt();
		System.out.println("Saisir le CD en seconde du sort Q du personnage: ");
		int QspellCd = sc.nextInt();
		// Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'�tre choisi par l'utilisateur)
		Personnage p1 = new Personnage( pointDeVie ,degat, nom , QspellCd);
		// Retourner l'instance du personnage
		System.out.println(p1);
		return p1;
	}

	/**
	 * D�finition al�atoire d'un nom pour l'ennemi ou Monstre
	 */
	public static String[] debutNom = new String[]{
			"Anivia","Yone","Yasuo","Brand"
	};
	public static String[] finNom = new String[]{
			" de Freljord"," de Runeterra"," de Shurima"," de Piltover"
	};

	static String Dnom = Monde.debutNom[new Random().nextInt(debutNom.length)]; 
	static String Fnom = Monde.finNom[new Random().nextInt(finNom.length)];

	/**
	 * Definition principal d'un ennemi au choix.
	 * @return
	 */
	public static Monstre monstreFactory() {
		Scanner sc = new Scanner(System.in);
		String nom = Dnom + Fnom;
		System.out.println("Saisir les d�gats du monstre: ");
		int degat = sc.nextInt();
		System.out.println("Saisir les points de vie du monstre: ");
		int pointDeVie = sc.nextInt();
		System.out.println("Saisir le CD en seconde du sort Q du monstre: ");
		int QspellCd = sc.nextInt();
		Monstre m1 = new Monstre(pointDeVie, degat, nom, QspellCd);
		System.out.println(m1);
		return m1;
	}
	/**
	 * Cr�ation d'une phase de combat entre le personnage et l'ennemi 
	 * Gestion des d�gats et des points de vies
	 * Affichage d'un r�sultat sp�cifique en fonction du gagnant
	 * @param personnage
	 * @param monstre
	 */
	public static void combat(AbstractCombattant personnage, AbstractCombattant monstre)
	{
		boolean turn = true;
		//  Phase de combat et gestion des points de vies
		while (personnage.getPointDeVie() > 0 && monstre.getPointDeVie() > 0 ) {
			if(turn) {
				System.out.println("Votre attaque inflige "+personnage.getDegat()+".");
				monstre.setPointDeVie(monstre.getPointDeVie() - personnage.getDegat());
				System.out.println("Au tour de l'ennemi !");
			}
			else {
				System.out.println("L'attaque ennemi vous inflige "+monstre.getDegat()+".");
				personnage.setPointDeVie(personnage.getPointDeVie() - monstre.getDegat());
				System.out.println("A votre tour !");
			}
			turn = !turn;
		}
		// Affichage du r�sultat du match
		System.out.printf("Il reste " + personnage.pointDeVie + " points de vie � " + personnage.getNom() +
				" et il reste " + monstre.pointDeVie + " points de vie � "+ monstre.getNom()+" ! \n"  );
		// Affichage diff�rent selon le vainqueurs
		if(personnage.getPointDeVie() < 0 && monstre.getPointDeVie() > 0) {
			System.out.println(monstre.getPointDeVie() + " � tuer "+personnage.getNom()+" ! \n");
			System.out.println("Bah super t'as feed un "+ monstre.getNom() +"... " );
		}
		else {
			System.out.println(personnage.getNom() + " � tuer "+monstre.getNom()+" !");
			System.out.println("Ha super "+ personnage.getNom() +" tu prend tout les kills mais tu carry pas ! " );
		}
	}

	//Simple affichage de la m�thode pr�cedente
	public static void afficherInformations()
	{
		System.out.println(personnageFactory());
	}
}
