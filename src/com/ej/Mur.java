package ej;

public class Mur extends Bloc{

    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur){
        super(longueur, largeur, hauteur, Couleur.GRIS);
        this.porteur=porteur;
    }

    public boolean estTraversable(){
        return !porteur;
    }

    public void afficherDescription(){
        System.out.println(
            "Je suis un mur: " +
            super.longueur + " " +
            super.largeur + " " +
            super.hauteur + " " +
            this.porteur);
    }
    
}
