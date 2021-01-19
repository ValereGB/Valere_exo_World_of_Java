package worldOfJava;


public interface ICombattant {
    /**
     * Cette m�thode appelle la m�thode d�fendre d'un adversaire pour lui infliger des d�gats
     * @param adversaire
     */
    public void attaquer(ICombattant adversaire);

    /**
     * Cette m�thode inflige des d�gats au combattant
     * @param degats
     */
    public void defendre(int degats);

    // Getters et Setters
    public String getNom();
    public int getDegat();
    public int getPointDeVie();
    public void setNom(String nom);
    public void setDegat(int degat);
    public void setPointDeVie(int pointDeVie);
}
