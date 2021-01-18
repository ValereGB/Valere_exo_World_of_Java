package worldOfJava;

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
				System.out.println("Saisir les dégats du personnage: ");
				int degats = sc.nextInt();
				System.out.println("Saisir les points de vie du personnage: ");
				int pointDeVie = sc.nextInt();
				System.out.println("Saisir le CD en seconde du sort Q du personnage: ");
				int QspellCd = sc.nextInt();
			    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
				Personnage p1 = new Personnage( pointDeVie ,degats, nom , QspellCd);
			    // Retourner l'instance du personnage
				System.out.println(p1);
				return p1;
	}
	//Simple affichage de la méthode précedente
	public static void afficherInformations()
	   {
	       System.out.println(personnageFactory());
	   }
}
