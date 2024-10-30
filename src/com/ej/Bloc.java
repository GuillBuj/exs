package ej;

public abstract class Bloc {

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(final int hauteur, final int largeur, final int longueur, final Couleur couleur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.longueur = longueur;
        this.couleur = couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    
    
}

