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
    public int getDegats();
    public int getPointDeVie();
    public void setNom(String nom);
    public void setDegats(int degats);
    public void setPointDeVie(int pointDeVie);
}
