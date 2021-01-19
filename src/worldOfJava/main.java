package worldOfJava;

import java.util.Scanner;

public class main {

	/**
	 * Créer un personnage avec tous ses attributs. 
	 * Demande a l'utilisateur d'entrer le nom du personnage.
	 * retour: une instance de la classe Personnage correctement instancié.


	public static void personnageFactory(){
	    // Demander a l'utilisateur un nom de personnage
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nom du personnage: ");
		String nom = sc.nextLine();
		System.out.println("Saisir les dégats du personnage: ");
		int degats = sc.nextInt();
		System.out.println("Saisir les points de vie du personnage: ");
		int pointDeVie = sc.nextInt();
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
		Personnage p1 = new Personnage( pointDeVie ,degats, nom);
	    // Retourner l'instance du personnage
		System.out.println(p1);
	}
	 **/

	public static void main(String[] args) {
		Monde.combat(Monde.PersonnageFactory(), Monde.MonstreFactory());
	}

}
